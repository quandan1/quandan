package com.eliteams.quick4j.test.dao;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ToSim11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("//" + " Created" + "\t"+": ");
        String datea = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        sb.append(datea);
        sb.append("\r\n");
        sb.append("//" + " DLL id" + "\t"+": ");
        sb.append("C:\\Program Files\\DHI\\2014\\bin\\pfs2004.dll");//服务器的DHI地址；
        sb.append("\r\n");
        sb.append("//" + " PFS version"+"  : Feb  "  +"4 2015 19:27:20");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("[Run11]");
        sb.append("\r\n");
        sb.append("   format_version = 107, 'MIKEZero, 2014'");
        sb.append("\r\n");
        sb.append("   Comment = ''");
        sb.append("\r\n");
        sb.append("   [Models]");
        sb.append("\r\n");
        sb.append("      hd = true, false");
        sb.append("\r\n");
        sb.append("      ad = true");
        sb.append("\r\n");
        sb.append("      st = false");
        sb.append("\r\n");
        sb.append("      rr = false");
        sb.append("\r\n");
        sb.append("      ff = false");
        sb.append("\r\n");
        sb.append("      da = false");
        sb.append("\r\n");
        sb.append("      ice = false");
        sb.append("\r\n");
        sb.append("      SimMode = 0");
        sb.append("\r\n");
        sb.append("      QSS = 0");
        sb.append("\r\n");
        sb.append("   EndSect  // Models");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("   [Input]");
        sb.append("\r\n");
        sb.append("      nwk = |.\\2017社河河网文件.nwk11|");
        sb.append("\r\n");
        sb.append("      xs = |.\\2017社河断面文件 -增加断面数.xns11|");
        sb.append("\r\n");
        sb.append("      bnd = |.\\2017社河边界文件 -无支流点源.bnd11|");
        sb.append("\r\n");
        sb.append("      rr = ||");
        sb.append("\r\n");
        sb.append("      hd = |.\\2017水动力参数文件.hd11|");
        sb.append("\r\n");
        sb.append("      ad = |.\\2017对流扩散参数文件.ad11|");
        sb.append("\r\n");
        sb.append("       wq = ||");
        sb.append("\r\n");
        sb.append("       st = ||");
        sb.append("\r\n");
        sb.append("       ff = ||");
        sb.append("\r\n");
        sb.append("       rhd = ||");
        sb.append("\r\n");
        sb.append("       rrr = ||");
        sb.append("\r\n");
        sb.append("       da = ||");
        sb.append("\r\n");
        sb.append("       ice = ||");
        sb.append("\r\n");
        sb.append("    EndSect  // Input");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    [Simulation]");
        sb.append("\r\n");
        sb.append("       [Simulation_Period]");
        sb.append("\r\n");
        sb.append("          start = 2017, 1, 1, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          end = 2017, 12, 31, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          TimeStepType = 0");
        sb.append("\r\n");
        sb.append("          timestep = 15");
        sb.append("\r\n");
        sb.append("          timestepunit = 3");
        sb.append("\r\n");
        sb.append("          dtFileName = ||");
        sb.append("\r\n");
        sb.append("          dtItemName = ''");
        sb.append("\r\n");
        sb.append("          dtItemNo = 0");
        sb.append("\r\n");
        sb.append("          ddtMin = 1");
        sb.append("\r\n");
        sb.append("          ddtMax = 30");
        sb.append("\r\n");
        sb.append("          idtMinMaxUnit = 2");
        sb.append("\r\n");
        sb.append("          ddtChangeRatio = 1.3");
        sb.append("\r\n");
        sb.append("          bDelB_BFlag = true");
        sb.append("\r\n");
        sb.append("          dDelB_BVal = 0.01");
        sb.append("\r\n");
        sb.append("          dDelB_BLim = 0.01");
        sb.append("\r\n");
        sb.append("          bDelQFlag = false");
        sb.append("\r\n");
        sb.append("          dDelQVal = 1");
        sb.append("\r\n");
        sb.append("          bDelQ_QFlag = true");
        sb.append("\r\n");
        sb.append("          dDelQ_QVal = 0.01");
        sb.append("\r\n");
        sb.append("          dDelQ_QLim = 0.01");
        sb.append("\r\n");
        sb.append("          bDelhFlag = false");
        sb.append("\r\n");
        sb.append("          dDelhVal = 0.01");
        sb.append("\r\n");
        sb.append("          bDelh_hFlag = true");
        sb.append("\r\n");
        sb.append("          dDelh_hVal = 0.01");
        sb.append("\r\n");
        sb.append("          dDelh_hLim = 0.01");
        sb.append("\r\n");
        sb.append("          bCourantFlagHD = false");
        sb.append("\r\n");
        sb.append("          dCourantValHD = 10");
        sb.append("\r\n");
        sb.append("          bCourantFlagAD = true");
        sb.append("\r\n");
        sb.append("          dCourantValAD = 1");
        sb.append("\r\n");
        sb.append("          ST_timestep_multiplier = 1");
        sb.append("\r\n");
        sb.append("          RR_timestep_multiplier = 1");
        sb.append("\r\n");
        sb.append("       EndSect  // Simulation_Period");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("       [Initial_Conditions]");
        sb.append("\r\n");
        sb.append("          hd = 1, ||, false, -1, -1, -1, -1, -1, -1");
        sb.append("\r\n");
        sb.append("          ad = 0, ||, false, 1990, 1, 1, 12, 0, 0");
        sb.append("\r\n");
        sb.append("          st = 0, ||, false, 1990, 1, 1, 12, 0, 0");
        sb.append("\r\n");
        sb.append("          rr = 0, ||, false, 1990, 1, 1, 12, 0, 0");
        sb.append("\r\n");
        sb.append("       EndSect  // Initial_Conditions");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    EndSect  // Simulation");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    [Results]");
        sb.append("\r\n");
        sb.append("       hd = |.\\2017水动力模拟结果\\2017水动力模拟1.res11|, '', 1, 1");
        sb.append("\r\n");
        sb.append("       ad = |.\\2017对流扩散模拟结果\\2017对流扩散模拟结果1.res11|, '', 1, 1");
        sb.append("\r\n");
        sb.append("       st = ||, '', 1, 0");
        sb.append("\r\n");
        sb.append("       rr = ||, '', 1, 0");
        sb.append("\r\n");
        sb.append("    EndSect  // Results");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("EndSect  // Run11");
        String dateb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String date = dateb.replaceAll("[[\\s-:punct:]]", "");

       // File f = new File("C:\\Users\\Administrator\\Desktop" + "\\" + "ad11" + date + ".ad11");//新建文件
        try {
//            BufferedWriter bw = null;
//            FileWriter fw = null;
//
//           // fw = new FileWriter(f);
//            bw = new BufferedWriter(fw);
//            bw.write(sb.toString());
//            bw.flush();
//            bw.close();
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "sim11" + date + ".sim11"));
            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "sim11" + date + ".sim11", true), "GBK");
            osw.write(String.valueOf(sb));
            osw.flush();
            osw.close();
System.out.println("ad11文件生成成功");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
