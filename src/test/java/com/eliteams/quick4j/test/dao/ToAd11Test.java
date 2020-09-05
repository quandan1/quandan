package com.eliteams.quick4j.test.dao;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ToAd11Test {
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
        sb.append("[MIKE0_AD]");
        sb.append("\r\n");
        sb.append("   [Global_Variables]");
        sb.append("\r\n");
        sb.append("       LastSelected = 0");
        sb.append("\r\n");
        sb.append("       G_Coli = false");
        sb.append("\r\n");
        sb.append("       G_Phos = false");
        sb.append("\r\n");
        sb.append("       LastLevel1 = 1");
        sb.append("\r\n");
        sb.append("       WQInter = 0");
        sb.append("\r\n");
        sb.append("       G_disp_factor = 0");
        sb.append("\r\n");
        sb.append("       G_exponent = 0");
        sb.append("\r\n");
        sb.append("       G_min_disp_coef = 0");
        sb.append("\r\n");
        sb.append("       G_max_disp_coef = 100");
        sb.append("\r\n");
        sb.append("       G_fact1 = 1");
        sb.append("\r\n");
        sb.append("       G_fact2 = 1");
        sb.append("\r\n");
        sb.append("       G_beta = 0.65");
        sb.append("\r\n");
        sb.append("       G_kin_visc = 1");
        sb.append("\r\n");
        sb.append("       G_porosity = 0.35");
        sb.append("\r\n");
        sb.append("       G_rel_dens = 2.65");
        sb.append("\r\n");
        sb.append("       G_thetac = 0.056");
        sb.append("\r\n");
        sb.append("       model_type = 1");
        sb.append("\r\n");
        sb.append("       G_Ice_latitude = 51");
        sb.append("\r\n");
        sb.append("       G_Ice_dens_water = 1000");
        sb.append("\r\n");
        sb.append("       G_Ice_spec_heat_water = 4200");
        sb.append("\r\n");
        sb.append("       G_Ice_latent_heat_ice = 330000");
        sb.append("\r\n");
        sb.append("       G_Ice_heat_flux = 12.5");
        sb.append("\r\n");
        sb.append("       G_Ice_dens_ice = 917");
        sb.append("\r\n");
        sb.append("       G_Ice_const_cross_A = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_const_activate = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_air_temp = 10");
        sb.append("\r\n");
        sb.append("       G_Ice_cloudness = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_cloud_dens = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_wind_speed = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_visibility = 25");
        sb.append("\r\n");
        sb.append("       G_Ice_precipitation = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_thickness = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_width = 0");
        sb.append("\r\n");
        sb.append("       G_Ice_quality = 0");
        sb.append("\r\n");
        sb.append("       G_Add_ConvG = false");
        sb.append("\r\n");
        sb.append("       G_Add_ConvGA = false");
        sb.append("\r\n");
        sb.append("       G_Add_DispersG = false");
        sb.append("\r\n");
        sb.append("       G_Add_DispersGA = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassBG = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassBGA = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassBT = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassBTA = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassG = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassGA = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassT = false");
        sb.append("\r\n");
        sb.append("       G_Add_MassTA = false");
        sb.append("\r\n");
        sb.append("       G_Add_MBranchT = false");
        sb.append("\r\n");
        sb.append("       G_Add_MBranchTA = false");
        sb.append("\r\n");
        sb.append("       G_Add_OrderG = false");
        sb.append("\r\n");
        sb.append("       G_Add_OrderGA = false");
        sb.append("\r\n");
        sb.append("       G_Add_OrderT = false");
        sb.append("\r\n");
        sb.append("       G_Add_OrderTA = false");
        sb.append("\r\n");
        sb.append("       G_Add_TransG = false");
        sb.append("\r\n");
        sb.append("       G_Add_TransGA = false");
        sb.append("\r\n");
        sb.append("       G_M12Comp = false");
        sb.append("\r\n");
        sb.append("       [MIKE12_Additional]");
        sb.append("\r\n");
        sb.append("          Mass = 0, 0, 0, 0, 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Mass_balance = 0, 0, 0, 0, 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Mass_branch = 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Decay_branch = 0, 0, 0, 0, 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Entrain_branch = 0, 0, 0, 0, 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Transport_total = 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Dispersive_trans = 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("          Convective_trans = 0, 0, 0, 0");
        sb.append("\r\n");
        sb.append("       EndSect  // MIKE12_Additional");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("       [MIKE12_Dispersion]");
        sb.append("\r\n");
        sb.append("          G_disp_factor = 0, 0");
        sb.append("\r\n");
        sb.append("          G_exponent = 0, 0");
        sb.append("\r\n");
        sb.append("          G_min_disp_coef = 0, 0");
        sb.append("\r\n");
        sb.append("          G_max_disp_coef = 100, 100");
        sb.append("\r\n");
        sb.append("       EndSect  // MIKE12_Dispersion");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("   EndSect  // Global_Variables");
        sb.append("\r\n");
        sb.append("   [InitList]");
        sb.append("\r\n");
        sb.append("      DATA = 1, 6, true, '', 0");
        sb.append("\r\n");
        sb.append("      DATA = 2, 0.03, true, '', 0");
        sb.append("\r\n");
        sb.append("      DATA = 3, 0, true, '', 0");
        sb.append("\r\n");
        sb.append("   EndSect  // InitList");
        sb.append("\r\n");
        sb.append("   [InitStratified]");
        sb.append("\r\n");
        sb.append("   EndSect  // InitStratified");
        sb.append("\r\n");
        sb.append("   [NonCohesList]");
        sb.append("\r\n");
        sb.append("   EndSect  // NonCohesList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("   [DecayList]");
        sb.append("\r\n");
        sb.append("      DATA = 1, 1e-006, true, '', 0");
        sb.append("\r\n");
        sb.append("      DATA = 2, 1e-006, true, '', 0");
        sb.append("\r\n");
        sb.append("      DATA = 3, 1e-006, true, '', 0");
        sb.append("\r\n");
        sb.append("    EndSect  // DecayList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    [DispersList]");
        sb.append("\r\n");
        sb.append("    EndSect  // DispersList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    [IceDataList]");
        sb.append("\r\n");
        sb.append("    EndSect  // IceDataList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    [Cohesive_ST]");
        sb.append("\r\n");
        sb.append("    EndSect  // Cohesive_ST");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("    [CompList]");
        sb.append("\r\n");
        sb.append("       DATA = 1, 'COD', 6, 0");
        sb.append("\r\n");
        sb.append("       DATA = 2, '氨氮', 6, 0");
        sb.append("\r\n");
        sb.append("       DATA = 3, '总磷', 6, 0");
        sb.append("\r\n");
        sb.append("     EndSect  // CompList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("     [LayerList]");
        sb.append("\r\n");
        sb.append("     EndSect  // LayerList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("     [M12DispersList]");
        sb.append("\r\n");
        sb.append("     EndSect  // M12DispersList");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append("EndSect  // MIKE0_AD");
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
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "ad11" + date + ".ad11"));
            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop" + "\\" + "ad11" + date + ".ad11", true), "GBK");
            osw.write(String.valueOf(sb));
            osw.flush();
            osw.close();
System.out.println("ad11文件生成成功");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
