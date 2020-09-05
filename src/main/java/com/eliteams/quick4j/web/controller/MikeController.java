package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.*;

@Controller
@RequestMapping("/mike")
public class MikeController {

    @Resource
    private ShuiXiService shuixiService;

    @Resource
    private HlswService hlswService;

    @Resource
    private PollSourceService pollsourceService;
    @Resource
    private PollFactoryService pollfactoryService;

    @Resource
    private MikeService mikeService;

    @RequestMapping("/searchAllQiYeTwo")
    @ResponseBody
    public HashMap get2(HttpServletRequest request,String snscmc, String tjnf)  {
        List l1 = new ArrayList();
        l1.add("现状");
        l1.add("容量");


        List l21 = new ArrayList();
        l21.add(25987);
        l21.add(56875);
        l21.add(36547);
        l21.add(48732);
        l21.add(15648);
        List l22 = new ArrayList();
        l22.add(45678);
        l22.add(16523);
        l22.add(36254);
        l22.add(59874);
        l22.add(22145);
        List l2 = new ArrayList();
        l2.add(l21);
        l2.add(l22);
        //  {'categ': ['男', '女'], 'data': [[], [3, 75, 25, 5, 1, 0]], 'name': ['青少年', '青年人', '中年人', '老年前期', '老年人', '长寿老人']}
        List l3 = new ArrayList();
        l3.add("3月");
        l3.add("4月");
        l3.add("5月");
        l3.add("6月");
        l3.add("7月");


        HashMap h =new HashMap();
        h.put("categ",l1);
        h.put("data",l2);
        h.put("name",l3);
        return h;


    }

    public  static void pressF10()
            throws AWTException
    {
        Robot r=new Robot();//创建自动化工具对象
        r.keyPress(KeyEvent.VK_F10);//按下左Contrl  keycode为17

    }

    //科学记数法
    public static String double2ScientificNotation(double num){
        //获取直接格式化结果
        String str = String.format("%E", num);

        str = str.replace("E-0", "E-");//将E-0N处理为E-N
//处理结果
        String temp = str.substring(0,str.indexOf(".")+4);//前4位
//精确到小数点后两位
        String f = String.format("%.3f", Double.parseDouble(temp));
        str = f+str.substring(str.indexOf("E"));
        return str;
    }

    @RequestMapping("/selectLymc")
    @ResponseBody
    public List<String>  selectLymc(){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMikeLymc());
        }
        list = removeDuplicate_2(list);

        return list;
    }
    @RequestMapping("/selectSxmc")
    @ResponseBody
    public List<String>  selectSxmc(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_lymc", (String) request.getParameter("lymc"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMikeSxmc());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/selectGl")
    @ResponseBody
    public List<String>  selectGl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_sxmc", (String) request.getParameter("sxmc"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMikeGl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select1jhl")
    @ResponseBody
    public List<String>  select1jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_gl", (String) request.getParameter("gl"));

        listone = mikeService.selectOne(map);

        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike1jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select2jhl")
    @ResponseBody
    public List<String>  select2jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_1jhl", (String) request.getParameter("yjhl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike2jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select3jhl")
    @ResponseBody
    public List<String>  select3jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_2jhl", (String) request.getParameter("ejhl"));

        listone = mikeService.selectOne(map);

        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike3jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select4jhl")
    @ResponseBody
    public List<String>  select4jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_3jhl", (String) request.getParameter("sanjhl"));

        listone = mikeService.selectOne(map);
        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike4jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    @RequestMapping("/select5jhl")
    @ResponseBody
    public List<String>  select5jhl(HttpServletRequest request){
        List<MikeJbxx> listone =new ArrayList<MikeJbxx>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("mike_4jhl", (String) request.getParameter("sijhl"));

        listone = mikeService.selectOne(map);

        List<String> list=new ArrayList<String>();

        for( MikeJbxx m: listone){
            list.add(m.getMike5jhl());
        }
        list = removeDuplicate_2(list);
        return list;
    }
    //去重方法
    public static List removeDuplicate_2(List list){
        HashSet set = new HashSet(list);
        //使用LinkedHashSet可以保证输入的顺序
        //LinkedHashSet<String> set2 = new LinkedHashSet<String>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    @RequestMapping("/getShujunf")
    @ResponseBody
    public List<PollSource>  getShujunf(HttpServletRequest request, String sj, String hlname, String lyname){
        sj = request.getParameter("sj");
        lyname =request.getParameter("lyname");

        hlname = request.getParameter("hlname");
        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);

        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("SNSTMC",hlname);
        map.put("SNSTDM", hlbh);
        List<PollSource> listone =new ArrayList<PollSource>();
        if(sj.equals("huantong")){
            listone =pollsourceService.getShuiwennf(map);
        }

        return listone;
    }

    @RequestMapping("/getShuiwennf")
    @ResponseBody
    public ArrayList<Integer>  getShuiwennf(HttpServletRequest request,String time,String lyname,String hlname){
        time = request.getParameter("time");
        lyname =request.getParameter("lyname");
       hlname = request.getParameter("hlname");



        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("hlsw_hlmc",hlname);
        map.put("hlsw_hlbh", hlbh);
        ArrayList<Integer> listone =new ArrayList<Integer>();
        listone =hlswService.selectDate(map);
        Integer i = 0;
        if(time !=null){
           i = Integer.valueOf(time);
        }






        if(time.equals("2017")){
            return listone;
        }else{
            if(listone.contains(i)){
                listone.clear();
                listone.add(i);
                return listone;
            }else{
                listone.clear();
                listone.add(2017);
                return listone;
            }
        }




    }

    @RequestMapping("/getQiye")
    @ResponseBody
    public List<PollSource>  getQiye(HttpServletRequest request,String time,String lyname,String hlname,String monizb){
        time = request.getParameter("time");
        lyname =request.getParameter("lyname");
        hlname = request.getParameter("hlname");
        monizb = request.getParameter("monizb");


        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("SNSTMC",hlname);
        map.put("SNSTDM", hlbh);
        map.put("TJNF", time);


        List<PollSource> listone =new ArrayList<PollSource>();
        listone =pollsourceService.getQiye(map);

        return listone;

    }


    @RequestMapping("/getWsc")
    @ResponseBody
    public List<PollFactory>  getWsc(HttpServletRequest request, String time, String lyname, String hlname, String monizb){
        time = request.getParameter("time");
        lyname =request.getParameter("lyname");
        hlname = request.getParameter("hlname");
        monizb = request.getParameter("monizb");


        HashMap map1 =new HashMap();
        map1.put("sx_hlmc",hlname);
        map1.put("sx_szly",lyname);
        ShuiXi s =  shuixiService.getRiverMessage(map1);
        String hlbh  = s.getSxHlbh();


        HashMap map =new HashMap();
        map.put("SNSTMC",hlname);
        map.put("SNSTDM", hlbh);
        map.put("TJNF", time);


        List<PollFactory> listone =new ArrayList<PollFactory>();
        listone =pollfactoryService.getWsc(map);

        return listone;

    }














    @RequestMapping("/searchRiverName")
    @ResponseBody
    public List test(HttpServletRequest request,String name,HttpServletResponse response)  {
        name = request.getParameter("name");
        HashMap map =new HashMap();
        map.put("sx_hlmc",name);
        ArrayList<ShuiXi> list = new ArrayList<>();
        ArrayList<String> riverlist = new ArrayList<>();
        list = shuixiService.getRiverName(map);
        for (ShuiXi s : list){
            riverlist.add(s.getSxHlmc());
        }


        return  riverlist;
    }

}