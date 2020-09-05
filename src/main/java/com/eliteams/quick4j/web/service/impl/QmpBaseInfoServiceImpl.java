package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.dao.QmpBaseInfoMapper;
import com.eliteams.quick4j.web.model.PollYangZhi;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.model.QmpBaseInfo;
import com.eliteams.quick4j.web.service.QmpBaseInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/04/21.
 */
@Service
public class QmpBaseInfoServiceImpl extends GenericServiceImpl<QmpBaseInfo, Long> implements QmpBaseInfoService{
/*    @Resource
    private QmpBaseInfo qmpBaseInfo;*/
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private QmpBaseInfoMapper qmpBaseInfoMapper;
    @Override
    public GenericDao<QmpBaseInfo, Long> getDao() {
        return (GenericDao<QmpBaseInfo, Long>)qmpBaseInfoMapper;
    }
    @Override
    public List<QmpBaseInfo> selectForMap(Map map) {
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
            map.put("loc_district", arr[1]);
        }

        return qmpBaseInfoMapper.selectForMap(map);
    }

    @Override
    public int insert(QmpBaseInfo qmpBaseInfo) {
        return 0;
    }

    /*@Override
    public int update(QmpBaseInfo qmpBaseInfo) {
        return 0;
    }*/

    @Override
    public List<QmpBaseInfo> searchByPage(String pageNow, Map map) {
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

        Page page = null;
        List<QmpBaseInfo> qmpBaseInfo = new ArrayList<QmpBaseInfo>();
        int totalCount = (int) qmpBaseInfoMapper.getSearchCount(map);
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            qmpBaseInfo = qmpBaseInfoMapper.searchByPage(page.getStartPos(), page.getPageSize(), map);
        } else {
            page = new Page(totalCount, 1);
            qmpBaseInfo = qmpBaseInfoMapper.searchByPage(page.getStartPos(), page.getPageSize(), map);
        }
        return qmpBaseInfo;
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

        Page page = null;
        int totalCount = (int) qmpBaseInfoMapper.getSearchCount(map);
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
        } else {
            page = new Page(totalCount, 1);
        }
        return page;
    }

    @Override
    public QmpBaseInfo selectById(int id) {
        System.out.println(id);
        return qmpBaseInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(int id) {
        return qmpBaseInfoMapper.deleteById(id);
    }

    @Override
    public int update(QmpBaseInfo model) {
        return qmpBaseInfoMapper.updateByPrimaryKey(model);
    }

    @Override
    public List<QmpBaseInfo> selectByPage(String pageNow) {
        Page page = null;
        List<QmpBaseInfo> qmpBaseInfo = new ArrayList<QmpBaseInfo>();
        int totalCount = (int) qmpBaseInfoMapper.getCount();
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            qmpBaseInfo = qmpBaseInfoMapper.selectByPage(page.getStartPos(), page.getPageSize());
        } else {
            page = new Page(totalCount, 1);
            qmpBaseInfo = qmpBaseInfoMapper.selectByPage(page.getStartPos(), page.getPageSize());
        }
        return qmpBaseInfo;
    }

    @Override
    public Page getPage(String pageNow) {
        Page page = null;
        int totalCount = (int) qmpBaseInfoMapper.getCount();
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
        } else {
            page = new Page(totalCount, 1);
        }
        return page;
    }

}
