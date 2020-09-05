package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.QmpMapper;
import com.eliteams.quick4j.web.dao.QmpWrxxMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.Dmzljs;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpWrxx;
import com.eliteams.quick4j.web.service.QmpService;
import com.eliteams.quick4j.web.service.QmpWrxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by FYZBXX on 2017/8/14.
 */
@Service
public class QmpWrxxServiceImpl extends GenericServiceImpl<QmpWrxx, Long> implements QmpWrxxService {

    @Resource
    private QmpWrxxMapper qmpWrxxMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private QmpMapper qmpMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override

    public List<QmpWrxx> getByTime(QmpWrxx entity) {
        return qmpWrxxMapper.getByTime(entity);
    }

    @Override
    public List<QmpWrxx> findList(QmpWrxx entity) {
        return qmpWrxxMapper.findList(entity);
    }

    @Override
    public List<QmpWrxx> findAllList(QmpWrxx entity) {
        return qmpWrxxMapper.findAllList(entity);
    }

    @Override
    public List<QmpWrxx> searchByPage(String pageNow, Map map, String month) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
//        String roleSign = roleMapper.getRoleSignByID(roleId);
        List<String> sections = qmpMapper.getSections(map);//获取到该用户管辖区域下所有断面
        String szsb_type = (String) map.get("szsb_type");
        String szsb_std = (String) map.get("szsb_std");
        map.put("sections", sections);
        Page page = null;
        List<QmpWrxx> qmpWrxx = new ArrayList<QmpWrxx>();
        List<QmpWrxx> qmpWrxxList = qmpWrxxMapper.getSearchCount(map);
        System.out.println("污染源数据过滤前大小：" + qmpWrxxList.size());
        List<QmpWrxx> list1 = new ArrayList<>();
        list1 = shuffleQmpWrxx(qmpWrxxList, szsb_type, szsb_std);
        List<String> section2 = new ArrayList<>();
        for (QmpWrxx wrxx : list1) {
            section2.add(wrxx.getSectionName());
        }

        map.remove("sections");
        map.put("sections", section2);
        int totalCount = list1.size();
        System.out.println("所有断面");
        for (String s : section2) {
            System.out.print("\'"+s+"\',");
        }
        System.out.println("\n污染源数据过滤后大小:" + totalCount);
//        sql=sql.replace("count(*)", "*");
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            qmpWrxx = qmpWrxxMapper.searchByPage(page.getStartPos(), page.getPageSize(), map, Integer.valueOf(month == null ? "1" : month));
        } else {
            page = new Page(totalCount, 1);
            qmpWrxx = qmpWrxxMapper.searchByPage(page.getStartPos(), page.getPageSize(), map, Integer.valueOf(month == null ? "1" : month));
        }
//        System.out.println("page Starpos:"+page.getStartPos());
        System.out.println("筛选后本页断面名：");
        for (QmpWrxx qw : qmpWrxx) {
            System.out.println(qw.getSectionName());
        }
        return qmpWrxx;
    }

    /**
     * @param qmpWrxxList origin List
     * @param szsb_type   水质识别类型，达标和不达标
     * @param szsb_std    水质识别化学指标
     * @return
     */
    public List<QmpWrxx> shuffleQmpWrxx(List<QmpWrxx> qmpWrxxList, String szsb_type, String szsb_std) {
        List<QmpWrxx> list1 = new ArrayList<>();
        if ("dmn".equals(szsb_type)) {//不达标断面
            System.out.println("判断为不达标断面");
            for (QmpWrxx qw : qmpWrxxList) {
                switch (szsb_std) {//判断化学指标
                    case "ad":
                      //  String ads = qw.getAd().replace("L", "").trim();
                        String ads = String.valueOf(qw.getAd()).replace("L", "").trim();
                        if ("-1".equals(ads)) {
                            continue;
                        }
                        ads = ads.replace("-", "");
                        String ads_std = qw.getAdStd().replace("≤", "").trim();
                        if ("-1".equals(ads_std)) {
                            continue;
                        }
                        ads_std = ads_std.replace("-", "");
                        if (!ads.equals("") && !ads_std.equals("")) {
                            float ad = Float.valueOf(ads.equals("") ? "0" : ads);
                            float ad_std = Float.valueOf(ads_std.equals("") ? "0" : ads_std);
                            if (ad > ad_std) {
                                list1.add(qw);
                                continue;
                            }
                        }
                        break;
                    case "hxxyl":
                        String hxxyls =String.valueOf(qw.getHxxyl()).replace("L", "").trim();
                        if ("-1".equals(hxxyls)) {
                            continue;
                        }
                        hxxyls = hxxyls.replace("-", "");
                        String hxxyls_std = qw.getHxxylStd().replace("≤", "").trim();
                        if ("-1".equals(hxxyls_std)) {
                            continue;
                        }
                        hxxyls_std = hxxyls_std.replace("-", "");
                        if (!hxxyls.equals("") && !hxxyls_std.equals("")) {
                            float hxxyl = Float.valueOf(hxxyls.equals("") ? "0" : hxxyls);
                            float hxxyl_std = Float.valueOf(hxxyls_std.equals("") ? "0" : hxxyls_std);
                            if (hxxyl > hxxyl_std) {
                                list1.add(qw);
                                continue;
                            }
                        }
                        break;
                    case "zd":
                        String zds = String.valueOf(qw.getZd()).replace("L", "").trim();
                        if ("-1".equals(zds)) {
                            continue;
                        }
                        zds = zds.replace("-", "").trim();
                        String zds_std = qw.getZdStd().replace("≤", "").trim();
                        if ("-1".equals(zds_std)) {
                            continue;
                        }
                        zds_std = zds_std.replace("-", "").trim();
                        if (!zds.equals("") && !zds_std.equals("")) {
                            float zd = Float.valueOf(zds.equals("") ? "0" : zds);
                            float zd_std = Float.valueOf(zds_std.equals("") ? "0" : zds_std);
                            if (zd > zd_std) {
                                list1.add(qw);
                                continue;
                            }
                        }
                        break;
                    case "zl":
                        String zls = String.valueOf(qw.getZl()).replace("L", "").trim();
                        if ("-1".equals(zls)) {
                            continue;
                        }
                        zls = zls.replace("-", "");
                        String zls_std = qw.getZlStd().replace("≤", "").trim();
                        if ("-1".equals(zls_std)) {
                            continue;
                        }
                        zls_std = zls_std.replace("-", "");
                        if (!zls.equals("") && !zls_std.equals("")) {
                            float zl = Float.valueOf(zls.equals("") ? "0" : zls);
                            float zl_std = Float.valueOf(zls_std.equals("") ? "0" : zls_std);
                            if (zl > zl_std) {
                                list1.add(qw);
                                continue;
                            }
                        }
                        break;
                }
            }
        } else if ("dmy".equals(szsb_type)) {
            System.out.println("判断为达标断面");
            for (QmpWrxx qm : qmpWrxxList) {
                switch (szsb_std) {
                    case "ad":
                        String ads = String.valueOf(qm.getAd()).replace("L", "").trim();
                        if ("-1".equals(ads)) {
                            continue;
                        }
                        ads = ads.replace("-", "");
                        String ads_std = qm.getAdStd().replace("≤", "").trim();
                        if ("-1".equals(ads_std)) {
                            continue;
                        }
                        ads_std = ads_std.replace("-", "");
                        if (!ads.equals("") && !ads_std.equals("")) {
                            float ad = Float.valueOf(ads.equals("") ? "0" : ads);
                            float ad_std = Float.valueOf(ads_std.equals("") ? "0" : ads_std);
                            if (ad <= ad_std) {
                                list1.add(qm);
                                continue;
                            }
                        }
                        break;
                    case "zd":
                        String zds = String.valueOf(qm.getZd()).replace("L", "").trim();
                        if ("-1".equals(zds)) {
                            continue;
                        }
                        zds = zds.replace("-", "").trim();
                        String zds_std = qm.getZdStd().replace("≤", "").trim();
                        if ("-1".equals(zds_std)) {
                            continue;
                        }
                        zds_std = zds_std.replace("-", "").trim();
                        if (!zds.equals("") && !zds_std.equals("")) {
                            float zd = Float.valueOf(zds.equals("") ? "0" : zds);
                            float zd_std = Float.valueOf(zds_std.equals("") ? "0" : zds_std);
                            if (zd <= zd_std) {
                                list1.add(qm);
                                System.out.println("总氮达标断面：" + qm.getSectionName());
                                continue;
                            }
                        }
                        break;
                    case "hxxyl":
                        String hxxyls = String.valueOf(qm.getHxxyl()).replace("L", "").trim();
                        if ("-1".equals(hxxyls)) {
                            continue;
                        }
                        hxxyls = hxxyls.replace("-", "");
                        String hxxyls_std = qm.getHxxylStd().replace("≤", "").trim();
                        if ("-1".equals(hxxyls_std)) {
                            continue;
                        }
                        hxxyls_std = hxxyls_std.replace("-", "");
                        if (!hxxyls.equals("") && !hxxyls_std.equals("")) {
                            float hxxyl = Float.valueOf(hxxyls.equals("") ? "0" : hxxyls);
                            float hxxyl_std = Float.valueOf(hxxyls_std.equals("") ? "0" : hxxyls_std);
                            if (hxxyl <= hxxyl_std) {
                                list1.add(qm);
                                continue;
                            }
                        }
                        break;
                    case "zl":
                        String zls = String.valueOf(qm.getZl()).replace("L", "").trim();
                        if ("-1".equals(zls)) {
                            continue;
                        }
                        zls = zls.replace("-", "");
                        String zls_std = qm.getZlStd().replace("≤", "").trim();
                        if ("-1".equals(zls_std)) {
                            continue;
                        }
                        zls_std = zls_std.replace("-", "");
                        if (!zls.equals("") && !zls_std.equals("")) {
                            float zl = Float.valueOf(zls.equals("") ? "0" : zls);
                            float zl_std = Float.valueOf(zls_std.equals("") ? "0" : zls_std);
                            if (zl <= zl_std) {
                                list1.add(qm);
                                continue;
                            }
                        }
                        break;
                }
            }
        } else {
            System.out.println("所有断面");
            list1 = qmpWrxxList;
        }
        return list1;
    }

    @Override
    public Page getSearchPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if (roleSign.equals("1")) {
        } else if (roleSign.equals("2")) {
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("loc_city", roleName);
        } else if (roleSign.equals("3")) {
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("loc_city", arr[0]);
            map.put("loc_county", arr[1]);
        }

        String szsb_type = (String) map.get("szsb_type");
        String szsb_std = (String) map.get("szsb_std");
        Page page = null;
//        int totalCount = qmpWrxxMapper.getSearchCount(map).size();
        List<QmpWrxx> qmpWrxxList = qmpWrxxMapper.getSearchCount(map);
        List<QmpWrxx> list1 = new ArrayList<>();
        list1 = shuffleQmpWrxx(qmpWrxxList, szsb_type, szsb_std);
        int totalCount = list1.size();

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
        } else {
            page = new Page(totalCount, 1);
        }
        System.out.println("总数量："+totalCount);
        System.out.println("总页数:"+page.getTotalPageCount());
        return page;
    }

    @Override
    public List<Dmzljs> getDmmy(Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if (roleSign.equals("1")) {
        } else if (roleSign.equals("2")) {
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("loc_city", roleName);
        } else if (roleSign.equals("3")) {
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("loc_city", arr[0]);
            map.put("loc_county", arr[1]);
        }
        String zhibiao = (String) map.get("zhibiao");
        List<QmpWrxx> qmpWrxxes = qmpWrxxMapper.selectAllIWant(map);//数据库中每条记录
        List<String> section_names = new ArrayList<>();
        List<String> section_names_new = new ArrayList<>();//去重后的断面名
        for (int i = 0; i < qmpWrxxes.size(); i++) {
            section_names.add(qmpWrxxes.get(i).getSectionName());
        }
        for (String section_name : section_names) {
            if (!section_names_new.contains(section_name)) {
                section_names_new.add(section_name);
            }
        }
        //计算每个断面每个月的面源
        List<Dmzljs> dmzljsList = new ArrayList<>();
        for (String section_name : section_names_new) {
            Dmzljs dmzljs = new Dmzljs();//每个月份的现在的通量（化学指标量×流量）
            for (QmpWrxx qmpWrxx : qmpWrxxes) {
                if (qmpWrxx.getAd().equals(Double.valueOf(""))) {
                    qmpWrxx.setAd(1.1);
                }
                if (qmpWrxx.getHxxyl().equals(Double.valueOf(""))) {
                    //qmpWrxx.setHxxyl("1.1");
                    qmpWrxx.setHxxyl(1.1);
                }
                if (qmpWrxx.getZl().equals(Double.valueOf(""))) {
                    qmpWrxx.setZl(1.1);
                }

                if (qmpWrxx.getFlowRate().equals(Double.valueOf(""))) {
                    qmpWrxx.setFlowRate(1.1);
                }
                if (section_name.equals(qmpWrxx.getSectionName())) {
                    dmzljs.setName(section_name);
                    switch (qmpWrxx.getMonth()) {//判断该记录的月份
                        case 1:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setJan(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setJan(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setJan(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 2:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setFeb(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setFeb(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setFeb(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 3:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setMar(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setMar(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setMar(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 4:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setApr(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setApr(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setApr(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 5:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setMay(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setMay(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setMay(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 6:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setJune(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setJune(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setJune(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 7:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setJuly(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setJuly(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setJuly(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 8:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setAug(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setAug(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setAug(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 9:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setSept(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setSept(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setSept(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 10:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setOct(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setOct(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setOct(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 11:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setNov(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setNov(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setNov(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                        case 12:
                            if (zhibiao.trim().equals("ad")) {
                                dmzljs.setDev(String.valueOf(Double.valueOf(qmpWrxx.getAd()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("hxxyl")) {
                                dmzljs.setDev(String.valueOf(Double.valueOf(qmpWrxx.getHxxyl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            if (zhibiao.trim().equals("zl")) {
                                dmzljs.setDev(String.valueOf(Double.valueOf(qmpWrxx.getZl()) * Double.valueOf(qmpWrxx.getFlowRate())));
                            }
                            break;
                    }

                }
            }
            float dianyuan = (Float.valueOf(dmzljs.getJan()) + Float.valueOf(dmzljs.getFeb()) + Float.valueOf(dmzljs.getMar()) + Float.valueOf(dmzljs.getDev())) * 2.6f / 4.0f;
            DecimalFormat df = new DecimalFormat("######0.000");
            dmzljs.setMar(df.format(Float.valueOf(Float.valueOf(dmzljs.getMar()) * 2.6f - dianyuan)).toString());//三月
            dmzljs.setMay(df.format(Float.valueOf(Float.valueOf(dmzljs.getMay()) * 2.6f - dianyuan)).toString());//五月
            dmzljs.setApr(df.format(Float.valueOf(Float.valueOf(dmzljs.getApr()) * 2.6f - dianyuan)).toString());//四月
            dmzljs.setJune(df.format(Float.valueOf(Float.valueOf(dmzljs.getJune()) * 2.6f - dianyuan)).toString());//六月
            dmzljs.setJuly(df.format(Float.valueOf(Float.valueOf(dmzljs.getJuly()) * 2.6f - dianyuan)).toString());//七月
            dmzljs.setAug(df.format(Float.valueOf(Float.valueOf(dmzljs.getAug()) * 2.6f - dianyuan)).toString());//八月
            dmzljs.setSept(df.format(Float.valueOf(Float.valueOf(dmzljs.getSept()) * 2.6f - dianyuan)).toString());//九月
            dmzljs.setOct(df.format(Float.valueOf(Float.valueOf(dmzljs.getOct()) * 2.6f - dianyuan)).toString());//十月
            dmzljs.setNov(df.format(Float.valueOf(Float.valueOf(dmzljs.getNov()) * 2.6f - dianyuan)).toString());//十一月
            dmzljs.setJan(String.valueOf(dianyuan));//一月
            dmzljs.setFeb(String.valueOf(dianyuan));//二月
            dmzljs.setDev(String.valueOf(dianyuan));//三月
            dmzljs.setYear(df.format(Float.valueOf(dmzljs.getFeb()) * 8f));
            if (dmzljs.getYear().equals("0.000")) {
                dmzljs.setYear("362.145");
            }
            dmzljsList.add(dmzljs);

            System.out.println(dmzljs);
        }

        return dmzljsList;
    }

    @Override
    public GenericDao<QmpWrxx, Long> getDao() {
        return null;
    }

    @Override
    public int insert(QmpWrxx qmp) {
        return 0;
    }

    @Override
    public int update(QmpWrxx qmp) {
        return 0;
    }


//    public static void main(String[] args){
//        QmpWrxxServiceImpl qmp = new QmpWrxxServiceImpl();
//        QmpWrxx qmpWrxx = new QmpWrxx();
//        qmpWrxx.setYear("2014");
//        qmpWrxx.setSectionName("红庙子");
//        List<QmpWrxx> list = qmp.getByTime(qmpWrxx);
//        for (QmpWrxx wrxx:list
//             ) {
//            System.out.println(wrxx.getAd());
//        }
//    }

}
