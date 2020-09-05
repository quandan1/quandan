package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.service.PollFactoryService;
import com.eliteams.quick4j.web.service.PollSourceService;
import com.eliteams.quick4j.web.service.PollYangZhiService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
class MysqlConnect{
    private String url;
    private String username;
    private String password;
    private String driver;
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public MysqlConnect(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String username = "root";
        String password = "18342212808y";
//        String url = "jdbc:mysql://127.0.0.1:3306/quick4j";
//        String username = "root";
//        String password = "123456";
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

}
public class poiExcelPoll {
	@Resource
    private PollFactoryService pollFactoryService;
	private PollSourceService pollSourceService;
	private PollYangZhiService pollYangZhiService;

    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";
    private static final String columnName_zpqy = "(XZQHDM,XZQHMC,TJNF,ZZJGDM,TBDWXXMC,KZDY," +
            "KZDM,QYZT,CYM,XXDZDQ_S_Z_M,XXDZX_Q_S_Q,XXDZX_Z,XXDZJ_C_MPH," +
            "ZXJD_D,ZXJD_F,ZXJD_M,JD_G,JD_ZCXD,ZXWD_D,ZXWD_F,ZXWD_M,WD_G,WD_ZCXD," +
            "DJZCLX,QYGM,SSJTGS,XYLBDM,XYLBMC,KYSJ_Y,KYSJ_N,SZLYDM,SZLYMC,PSQXDM," +
            "PSQXLX,PRDWSCLCDM,PRDWSCLCMC,SNSTDM,SNSTMC,GYZCZ_DNJG_WY,NZCSCSJ_XS," +
            "GYYSL_D,QZ_QSL_D,QZ_ZFYSL_D,ZYYFCLYL1,ZYYFCLYL_JLDW1,ZYYFCLYL_BNSJ1," +
            "ZYYFCLYL2,ZYYFCLYL_JLDW2,ZYYFCLYL_BNSJ2,ZYYFCLYL3,ZYYFCLYL_JLDW3," +
            "ZYYFCLYL_BNSJ3,ZYCPSCQK1,ZYCPSCQK_JLDW1,ZYCPSCQK_BNSJ1,ZYCPSCQK2," +
            "ZYCPSCQK_JLDW2,ZYCPSCQK_BNSJ2,ZYCPSCQK3,ZYCPSCQK_JLDW3,ZYCPSCQK_BNSJ3," +
            "FSZLSSS_T,FSZLSSCLNL_D_R,FSZLSSYXFY_WY,GYFSCLL_D,GYFSPFL_D," +
            "QZ_ZJPRHJD_D,QZ_PRWSCLCD_D,PRWSCLCDHXXYLND_HK_S,PRWSCLCDADND_HK_S," +
            "PRWSCLCDSYLND_HK_S,HXXYLCSL_D,HXXYLPFL_D,ADCSL_D,ADPFL_D,SYLCSL_D,SYLPFL_D," +
            "HFFCSL_QK,HFFPFL_QK,QHWCSL_QK,QHWPFL_QK,FSSCSL_QK,FSSPFL_QK,FSQCSL_QK," +
            "FSQPFL_QK,FSGCSL_QK,FSGPFL_QK,FSGCSL_QK_DUP1,FSGPFL_QK_DUP1,FSZGCSL_QK," +
            "FSZGPFL_QK,FSLJGCSL_QK,FSLJGPFL_QK,is_del )";
    private static final String columnName_zpqy_replace = "(ID,XZQHDM,XZQHMC,TJNF,ZZJGDM,TBDWXXMC,KZDY," +
            "KZDM,QYZT,CYM,XXDZDQ_S_Z_M,XXDZX_Q_S_Q,XXDZX_Z,XXDZJ_C_MPH," +
            "ZXJD_D,ZXJD_F,ZXJD_M,JD_G,JD_ZCXD,ZXWD_D,ZXWD_F,ZXWD_M,WD_G,WD_ZCXD," +
            "DJZCLX,QYGM,SSJTGS,XYLBDM,XYLBMC,KYSJ_Y,KYSJ_N,SZLYDM,SZLYMC,PSQXDM," +
            "PSQXLX,PRDWSCLCDM,PRDWSCLCMC,SNSTDM,SNSTMC,GYZCZ_DNJG_WY,NZCSCSJ_XS," +
            "GYYSL_D,QZ_QSL_D,QZ_ZFYSL_D,ZYYFCLYL1,ZYYFCLYL_JLDW1,ZYYFCLYL_BNSJ1," +
            "ZYYFCLYL2,ZYYFCLYL_JLDW2,ZYYFCLYL_BNSJ2,ZYYFCLYL3,ZYYFCLYL_JLDW3," +
            "ZYYFCLYL_BNSJ3,ZYCPSCQK1,ZYCPSCQK_JLDW1,ZYCPSCQK_BNSJ1,ZYCPSCQK2," +
            "ZYCPSCQK_JLDW2,ZYCPSCQK_BNSJ2,ZYCPSCQK3,ZYCPSCQK_JLDW3,ZYCPSCQK_BNSJ3," +
            "FSZLSSS_T,FSZLSSCLNL_D_R,FSZLSSYXFY_WY,GYFSCLL_D,GYFSPFL_D," +
            "QZ_ZJPRHJD_D,QZ_PRWSCLCD_D,PRWSCLCDHXXYLND_HK_S,PRWSCLCDADND_HK_S," +
            "PRWSCLCDSYLND_HK_S,HXXYLCSL_D,HXXYLPFL_D,ADCSL_D,ADPFL_D,SYLCSL_D,SYLPFL_D," +
            "HFFCSL_QK,HFFPFL_QK,QHWCSL_QK,QHWPFL_QK,FSSCSL_QK,FSSPFL_QK,FSQCSL_QK," +
            "FSQPFL_QK,FSGCSL_QK,FSGPFL_QK,FSGCSL_QK_DUP1,FSGPFL_QK_DUP1,FSZGCSL_QK," +
            "FSZGPFL_QK,FSLJGCSL_QK,FSLJGPFL_QK,is_del )";
    private static final String columnName_wsclc = "(XZQHDM, XZQHMC, TJNF, ZZJGDM, DWMC_GZ," +
            " SSDM, SSKZDY, YYDWMC, FDDBR, QYXXDZ_S_ZZQ_ZXS, QYXXDZ_DQ_S_Z_M, QYXXDZ_X_Q_S_Q," +
            " QYXXDZ_X_Z, QYXXDZ_J_C_MPH, ZXJD_D, ZXJD_F, ZXJD_M, JD, ZXWD_D, ZXWD_F, ZXWD_M, " +
            "WD, LXFSDHHM, LXFSLXR, LXFSCZHM, LXFSYZBM, WSCLSSLX, JCSJ, WSCLJB, WSCLFFMC1, " +
            "WSCLFFDM1, WSCLFFMC2, WSCLFFDM2, PSQXLXMC, PSQXLXDM, SNSTMC, SNSTDM, YXTS_T, " +
            "LJWCTZ_WY, XZGDZCTZ_WY, YXFY_WY, YDL_WQWS, WSSJCLNL_D_R, WSSJCLL_WD, QZ_CLSHWSL_WD," +
            " QZ_CLGYFSL_WD, QZ_CLBXQWDSL_WD, ZSSSCL_WD, ZSSLYL_WD, QZ_GYYSL_WD, QZ_SZYS_WD," +
            " QZ_JGYSL_WD, WNCSL_D, WNCZL_D, QZ_TDLYL_D, QZ_TMCZL_D, QZ_JZCLLYL_D, QZ_FSCZL_D," +
            " WNQDDQL_D, HXXYLQCL_D, HXXYLJKND_HK_S, HXXYLCKND_HK_S, ADQCL_D, ADJKND_HK_S, " +
            "ADCKND_HK_S, YLQCL_D, YLJKND_HK_S, YLCKND_HK_S, ZDQCL_D, ZDJKND_HK_S, ZDCKND_HK_S," +
            " ZLQCL_QK, ZLJKND_HK_S, ZLCKND_HK_S, HFFQCL_QK, HFFJKND_HK_S, HFFCKND_HK_S," +
            " QHWQCL_QK, QHWJKND_HK_S, QHWCKND_HK_S, SQCL_QK, SJKND_HK_S, SCKND_HK_S, QQCL_QK," +
            " QJKND_HK_S, QCKND_HK_S, GQCL_QK, GJKND_HK_S, GCKND_HK_S, GQCL_QK_dup1, GJKND_WK_S," +
            " GCKND_WK_S, ZGQCL_QK, ZGJKND_HK_S, ZGCKND_HK_S, LJGQCL_QK, LJGJKND_HK_S, LJGCKND_HK_S," +
            " GY_CLSL_WD_R, GY_XZCLSL_WD_R, GY_YXTS_T, GY_CODJKND_HK_S, GY_CODCKND_HK_S," +
            " GY_ADJKND_HK_S, GY_ADCKND_HK_S, SH_CLSL_WD_R, SH_XZCLSL_WD_R, SH_CODJKND_HK_S," +
            " SH_CODCKND_HK_S, SH_ADJKND_HK_S, SH_ADCKND_HK_S, HDXZSHCODQCL_D, HDXZSHADQCL_D," +
            " BZ, is_del)";
    private static final String columnName_wsclc_repalce = "(ID, XZQHDM, XZQHMC, TJNF, ZZJGDM, DWMC_GZ," +
            " SSDM, SSKZDY, YYDWMC, FDDBR, QYXXDZ_S_ZZQ_ZXS, QYXXDZ_DQ_S_Z_M, QYXXDZ_X_Q_S_Q," +
            " QYXXDZ_X_Z, QYXXDZ_J_C_MPH, ZXJD_D, ZXJD_F, ZXJD_M, JD, ZXWD_D, ZXWD_F, ZXWD_M, " +
            "WD, LXFSDHHM, LXFSLXR, LXFSCZHM, LXFSYZBM, WSCLSSLX, JCSJ, WSCLJB, WSCLFFMC1, " +
            "WSCLFFDM1, WSCLFFMC2, WSCLFFDM2, PSQXLXMC, PSQXLXDM, SNSTMC, SNSTDM, YXTS_T, " +
            "LJWCTZ_WY, XZGDZCTZ_WY, YXFY_WY, YDL_WQWS, WSSJCLNL_D_R, WSSJCLL_WD, QZ_CLSHWSL_WD," +
            " QZ_CLGYFSL_WD, QZ_CLBXQWDSL_WD, ZSSSCL_WD, ZSSLYL_WD, QZ_GYYSL_WD, QZ_SZYS_WD," +
            " QZ_JGYSL_WD, WNCSL_D, WNCZL_D, QZ_TDLYL_D, QZ_TMCZL_D, QZ_JZCLLYL_D, QZ_FSCZL_D," +
            " WNQDDQL_D, HXXYLQCL_D, HXXYLJKND_HK_S, HXXYLCKND_HK_S, ADQCL_D, ADJKND_HK_S, " +
            "ADCKND_HK_S, YLQCL_D, YLJKND_HK_S, YLCKND_HK_S, ZDQCL_D, ZDJKND_HK_S, ZDCKND_HK_S," +
            " ZLQCL_QK, ZLJKND_HK_S, ZLCKND_HK_S, HFFQCL_QK, HFFJKND_HK_S, HFFCKND_HK_S," +
            " QHWQCL_QK, QHWJKND_HK_S, QHWCKND_HK_S, SQCL_QK, SJKND_HK_S, SCKND_HK_S, QQCL_QK," +
            " QJKND_HK_S, QCKND_HK_S, GQCL_QK, GJKND_HK_S, GCKND_HK_S, GQCL_QK_dup1, GJKND_WK_S," +
            " GCKND_WK_S, ZGQCL_QK, ZGJKND_HK_S, ZGCKND_HK_S, LJGQCL_QK, LJGJKND_HK_S, LJGCKND_HK_S," +
            " GY_CLSL_WD_R, GY_XZCLSL_WD_R, GY_YXTS_T, GY_CODJKND_HK_S, GY_CODCKND_HK_S," +
            " GY_ADJKND_HK_S, GY_ADCKND_HK_S, SH_CLSL_WD_R, SH_XZCLSL_WD_R, SH_CODJKND_HK_S," +
            " SH_CODCKND_HK_S, SH_ADJKND_HK_S, SH_ADCKND_HK_S, HDXZSHCODQCL_D, HDXZSHADQCL_D," +
            " BZ, is_del)";
    private static final String columnName_gmhxqyz = "( XZQHDM, XZQHMC, TJNF, YZCBM, YZCMC, JD, " +
            "WD, KZDM, KZDY, YZLX, BHHS, FZR, LXDH, DZ_P, DZ_S, DZ_X, XZ, JC, SZLYMC, SZLYDM, SNSTMC, " +
            "SNSTDM, XQZL, YZCLSZMJ, ZWSSLJTZ, XZGDZC, PTNYTDLYMJ, PTNYTDLYFS, PTSCYZSMMJ, SYL, SYZQ," +
            " DCYZFSSZBL, DLNYLY, DLSCYJF, DLWCL, GQF_YZFSSZBL, GQF_ZJLYL, GQF_SCYJFL, GQF_SCZQL, " +
            "GQF_WCLL, GQFWS_ZJNYLYL, GQFWS_YYCLL, GQFWS_YY_NYLYL, GQFWS_YY_HYLYL, GQFWS_YY_HY_SDCLL," +
            " GQFWS_WCLL, SCF_YZFSSZBL, SCF_ZJNYLYL, SCF_SCYJFL, SCF_SCZQL, SCF_WCLL, SCFNYWS_ZJNYLYL, " +
            "SCFNYWS_YYCLL, SCFNYWS_YY_NYLYL, SCFNYWS_YY_HYCLL, SCFNYWS_YY_HY_SDCLL, SCFNYWS_WCLL, " +
            "JPHDHXXYLQCL, JPHDADQCL, CSL_HXXYL, CSL_ZD, CSL_ZL, CSL_AD, PFL_HXXYL, PFL_ZD, PFL_ZL," +
            " PFL_AD, QCL_HXXYL, QCL_ZD, QCL_ZL, QCL_AD, BZ, is_del) ";
    private static final String columnName_gmhxqyz_replace = "(ID, XZQHDM, XZQHMC, TJNF, YZCBM, YZCMC, JD, " +
            "WD, KZDM, KZDY, YZLX, BHHS, FZR, LXDH, DZ_P, DZ_S, DZ_X, XZ, JC, SZLYMC, SZLYDM, SNSTMC, " +
            "SNSTDM, XQZL, YZCLSZMJ, ZWSSLJTZ, XZGDZC, PTNYTDLYMJ, PTNYTDLYFS, PTSCYZSMMJ, SYL, SYZQ," +
            " DCYZFSSZBL, DLNYLY, DLSCYJF, DLWCL, GQF_YZFSSZBL, GQF_ZJLYL, GQF_SCYJFL, GQF_SCZQL, " +
            "GQF_WCLL, GQFWS_ZJNYLYL, GQFWS_YYCLL, GQFWS_YY_NYLYL, GQFWS_YY_HYLYL, GQFWS_YY_HY_SDCLL," +
            " GQFWS_WCLL, SCF_YZFSSZBL, SCF_ZJNYLYL, SCF_SCYJFL, SCF_SCZQL, SCF_WCLL, SCFNYWS_ZJNYLYL, " +
            "SCFNYWS_YYCLL, SCFNYWS_YY_NYLYL, SCFNYWS_YY_HYCLL, SCFNYWS_YY_HY_SDCLL, SCFNYWS_WCLL, " +
            "JPHDHXXYLQCL, JPHDADQCL, CSL_HXXYL, CSL_ZD, CSL_ZL, CSL_AD, PFL_HXXYL, PFL_ZD, PFL_ZL," +
            " PFL_AD, QCL_HXXYL, QCL_ZD, QCL_ZL, QCL_AD, BZ, is_del) ";


    private ArrayList<ArrayList<Integer>> checkHasExistZpqy(ArrayList<ArrayList<String>> checkSet) throws ClassNotFoundException, SQLException {
        MysqlConnect connect = new MysqlConnect();
        String driver = connect.getDriver();
        String url = connect.getUrl();
        String username = connect.getUsername();
        String password = connect.getPassword();
        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        String sql;
        sql = "SELECT * FROM pollution WHERE xzqhdm=? AND xzqhmc=? AND tjnf=? AND zzjgdm=?";
        String xzqhdm;
        String xzqhmc;
        String tjnf;
        String zzjgdm;
        ArrayList<Integer> updateSet = new ArrayList<>();
        ArrayList<Integer> insertSet = new ArrayList<>();
        ArrayList<Integer> idSet = new ArrayList<>();
        ArrayList<ArrayList<Integer>> reSet = new ArrayList<>();
        ResultSet rs = null;
        String thisId;
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        for (ArrayList<String> checkField : checkSet) {
            xzqhdm = checkField.get(0).replace("\"", "");
            xzqhmc = checkField.get(1).replace("\"", "");
            tjnf = checkField.get(2).replace("\"", "");
            zzjgdm = checkField.get(3).replace("\"", "");
            PreparedStatement stmp = conn.prepareStatement(sql);
            stmp.setString(1, xzqhdm);
            stmp.setString(2, xzqhmc);
            stmp.setString(3, tjnf);
            stmp.setString(4, zzjgdm);
            stmp.execute();
            rs = stmp.getResultSet();
            if (rs.next()) {
                idSet.add(rs.getInt(1));
                updateSet.add(checkSet.indexOf(checkField));
            } else {
                insertSet.add(checkSet.indexOf(checkField));
            }
        }

        System.out.println("update:"+updateSet.size());
        System.out.println("update:"+updateSet);
        System.out.println("insert:"+insertSet.size());
        System.out.println("insert:"+insertSet);
        System.out.println("id:"+idSet.size());
        System.out.println("id:"+idSet);

        reSet.add(updateSet);
        reSet.add(insertSet);
        reSet.add(idSet);
        conn.close();
        return reSet;
    }
    private ArrayList<ArrayList<Integer>> checkHasExistWsclc(ArrayList<ArrayList<String>> checkSet) throws ClassNotFoundException, SQLException {
        MysqlConnect connect = new MysqlConnect();
        String driver = connect.getDriver();
        String url = connect.getUrl();
        String username = connect.getUsername();
        String password = connect.getPassword();
        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        String sql;
        sql = "SELECT * FROM poll_factory WHERE xzqhdm=? AND xzqhmc=? AND tjnf=? AND zzjgdm=? AND ssdm=?;";
        String xzqhdm;
        String xzqhmc;
        String tjnf;
        String zzjgdm;
        String ssdm;
        ArrayList<Integer> updateSet = new ArrayList<>();
        ArrayList<Integer> insertSet = new ArrayList<>();
        ArrayList<Integer> idSet = new ArrayList<>();
        ArrayList<ArrayList<Integer>> reSet = new ArrayList<>();
        ResultSet rs = null;
        String thisId;
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        for (ArrayList<String> checkField : checkSet) {
            xzqhdm = checkField.get(0).replace("\"", "");
            xzqhmc = checkField.get(1).replace("\"", "");
            tjnf = checkField.get(2).replace("\"", "");
            zzjgdm = checkField.get(3).replace("\"", "");
            ssdm = checkField.get(4).replace("\"", "");
            PreparedStatement stmp = conn.prepareStatement(sql);
            stmp.setString(1, xzqhdm);
            stmp.setString(2, xzqhmc);
            stmp.setString(3, tjnf);
            stmp.setString(4, zzjgdm);
            stmp.setString(5, ssdm);
            stmp.execute();
            rs = stmp.getResultSet();
            if (rs.next()) {
                idSet.add(rs.getInt(1));
                updateSet.add(checkSet.indexOf(checkField));
            } else {

                insertSet.add(checkSet.indexOf(checkField));
            }
        }

        System.out.println("update:"+updateSet.size());
        System.out.println("update:"+updateSet);
        System.out.println("insert:"+insertSet.size());
        System.out.println("insert:"+insertSet);
        System.out.println("id:"+idSet.size());
        System.out.println("id:"+idSet);

        reSet.add(updateSet);
        reSet.add(insertSet);
        reSet.add(idSet);
        conn.close();
        return reSet;
    }
    private ArrayList<ArrayList<Integer>> checkHasExistGmhxqyz(ArrayList<ArrayList<String>> checkSet) throws ClassNotFoundException, SQLException {
        MysqlConnect connect = new MysqlConnect();
        String driver = connect.getDriver();
        String url = connect.getUrl();
        String username = connect.getUsername();
        String password = connect.getPassword();
        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        String sql;
        sql = "SELECT * FROM poll_yangzhi WHERE xzqhdm=? AND xzqhmc=? AND tjnf=? AND yzcbm=?;";
        String xzqhdm;
        String xzqhmc;
        String tjnf;
        String yzcbm;
        ArrayList<Integer> updateSet = new ArrayList<>();
        ArrayList<Integer> insertSet = new ArrayList<>();
        ArrayList<Integer> idSet = new ArrayList<>();
        ArrayList<ArrayList<Integer>> reSet = new ArrayList<>();

        ResultSet rs = null;
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功——查询！");
        }
        for (ArrayList<String> checkField : checkSet) {
            xzqhdm = checkField.get(0).replace("\"", "");
            xzqhmc = checkField.get(1).replace("\"", "");
            tjnf = checkField.get(2).replace("\"", "");
            yzcbm = checkField.get(3).replace("\"", "");
            PreparedStatement stmp = conn.prepareStatement(sql);
            stmp.setString(1, xzqhdm);
            stmp.setString(2, xzqhmc);
            stmp.setString(3, tjnf);
            stmp.setString(4, yzcbm);
            stmp.execute();
            rs = stmp.getResultSet();
            if (rs.next()) {
                idSet.add(rs.getInt(1));
                updateSet.add(checkSet.indexOf(checkField));
            } else {
                insertSet.add(checkSet.indexOf(checkField));
            }
        }

        System.out.println("update:"+updateSet.size());
        System.out.println("update:"+updateSet);
        System.out.println("insert:"+insertSet.size());
        System.out.println("insert:"+insertSet);
        System.out.println("id:"+idSet.size());
        System.out.println("id:"+idSet);

        reSet.add(updateSet);
        reSet.add(insertSet);
        reSet.add(idSet);
        conn.close();
        return reSet;
    }


    private String executeInsertZpqy(ArrayList<Integer> insertSet, ArrayList<StringBuilder> dataSet) {
        System.out.println(columnName_zpqy);
        System.out.println("-----------------------------------");
        StringBuilder sql = new StringBuilder("INSERT INTO pollution" +
                columnName_zpqy.replace(",JD_ZCXD","").replace(",WD_ZCXD","") +
                "VALUES(");
        for(Integer index : insertSet){
            sql = sql.append(dataSet.get(index).toString()).append("),(");
        }
        String newSql = sql.toString();
//        System.out.println(newSql);
        return sql.toString().substring(0,newSql.length()-2);
    }
    private String executeInsertWsclc(ArrayList<Integer> insertSet, ArrayList<StringBuilder> dataSet) {
        System.out.println("-----------------------------------");
        StringBuilder sql = new StringBuilder("INSERT INTO poll_factory" + columnName_wsclc + "VALUES(");
        for(Integer index : insertSet){
            sql = sql.append(dataSet.get(index).toString()).append("),(");
        }
        String newSql = sql.toString();
        System.out.println(newSql);
        return sql.toString().substring(0,newSql.length()-2);
    }
    private String executeInsertGmhxqyz(ArrayList<Integer> insertSet, ArrayList<StringBuilder> dataSet) {
        System.out.println("-----------------------------------");
        StringBuilder sql = new StringBuilder("INSERT INTO poll_yangzhi" + columnName_gmhxqyz + "VALUES(");
        for(Integer index : insertSet){
            sql = sql.append(dataSet.get(index).toString()).append("),(");
        }
        String newSql = sql.toString();
        System.out.println(newSql);
        return sql.toString().substring(0,newSql.length()-2);
    }


    private String executeReplaceZpqy(ArrayList<Integer> updateSet, ArrayList<Integer> idSet, ArrayList<StringBuilder> dataSet) {
        System.out.println("-----------------------------------");
        StringBuilder sql = new StringBuilder("REPLACE INTO pollution" +
                columnName_zpqy_replace.replace(",JD_ZCXD","").replace(",WD_ZCXD","") +
                "VALUES(");        int i = 0;
        ArrayList<String> sqlList = new ArrayList<>();
        for(Integer index : updateSet){
            Integer idValue = idSet.get(i++);
            sql = sql.append("\"").append(idValue.toString()).append("\",").append(dataSet.get(index).toString()).append("),(");
//            System.out.println(sql);
        }
        String newSql = sql.toString();

        return sql.toString().substring(0,newSql.length()-2);

    }
    private String executeReplaceWsclc(ArrayList<Integer> updateSet, ArrayList<Integer> idSet, ArrayList<StringBuilder> dataSet) {
        System.out.println("-----------------------------------");
        StringBuilder sql = new StringBuilder("REPLACE INTO poll_factory" + columnName_wsclc_repalce + "VALUES(");
        int i = 0;
        ArrayList<String> sqlList = new ArrayList<>();
        for(Integer index : updateSet){
            Integer idValue = idSet.get(i++);
            sql = sql.append("\"").append(idValue.toString()).append("\",").append(dataSet.get(index).toString()).append("),(");
//            System.out.println(sql);
        }
        String newSql = sql.toString();

        return sql.toString().substring(0,newSql.length()-2);

    }
    private String executeReplaceGmhxqyz(ArrayList<Integer> updateSet, ArrayList<Integer> idSet, ArrayList<StringBuilder> dataSet) {
        System.out.println("-----------------------------------");
        StringBuilder sql = new StringBuilder("REPLACE INTO poll_yangzhi" + columnName_gmhxqyz_replace + "VALUES(");
        int i = 0;
        ArrayList<String> sqlList = new ArrayList<>();
        for(Integer index : updateSet){
            Integer idValue = idSet.get(i++);
            sql = sql.append("\"").append(idValue.toString()).append("\",").append(dataSet.get(index).toString()).append("),(");
//            System.out.println(sql);
        }
        String newSql = sql.toString();

        return sql.toString().substring(0,newSql.length()-2);

    }


    private int[] connectMySQLZpqy(ArrayList<StringBuilder> dataSet, ArrayList<ArrayList<String>> checkSet, String fileType) throws ClassNotFoundException, SQLException, NullPointerException {        MysqlConnect connect = new MysqlConnect();
        String driver = connect.getDriver();
        String url = connect.getUrl();
        String username = connect.getUsername();
        String password = connect.getPassword();


        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功！");
        }
        int[] rs_count = new int[2];
        int rsCountInsert = 0;
        int rsCountUpdate = 0;
        String sql;
        // 创建statement类对象，用来执行SQL语句
        Statement statement = conn.createStatement();
        ArrayList<ArrayList<Integer>> reSet = checkHasExistZpqy(checkSet);
//        System.out.println("updateSet.size():");
//        System.out.println(reSet.get(0).size());
        if(reSet.get(1).size() != 0){
            String sql1 = executeInsertZpqy(reSet.get(1), dataSet);
            System.out.println(sql1);
            statement.execute(sql1);
        }
        if (reSet.get(0).size() != 0){
            String sql2 = executeReplaceZpqy(reSet.get(0), reSet.get(2), dataSet);
            System.out.println(sql2);
            statement.execute(sql2);

        }
//        System.out.println(reSet.get(0).size());
//        System.out.println(reSet.get(1).size());
        rs_count[0] = reSet.get(0).size();
        rs_count[1] = reSet.get(1).size();
        conn.close();
        return rs_count;
    }
    private int[] connectMySQLWsclc(ArrayList<StringBuilder> dataSet, ArrayList<ArrayList<String>> checkSet, String fileType) throws ClassNotFoundException, SQLException, NullPointerException {
        MysqlConnect connect = new MysqlConnect();
        String driver = connect.getDriver();
        String url = connect.getUrl();
        String username = connect.getUsername();
        String password = connect.getPassword();


        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功！");

        }
        int[] rs_count = new int[2];
        int rsCountInsert = 0;
        int rsCountUpdate = 0;
        String sql;
        // 创建statement类对象，用来执行SQL语句
        Statement statement = conn.createStatement();
        ArrayList<ArrayList<Integer>> reSet = checkHasExistWsclc(checkSet);
//        System.out.println("updateSet.size():");
//        System.out.println(reSet.get(0).size());
        if(reSet.get(1).size() != 0){
            String sql1 = executeInsertWsclc(reSet.get(1), dataSet);
            System.out.println(sql1);
            statement.execute(sql1);
        }
//        if (reSet.get(0).size() != 0){
//            ArrayList<String> sqlList = executeUpdateWsclc(reSet.get(0), reSet.get(2), dataSet);
//            System.out.println(sqlList);
//            for (String s : sqlList) {
//                System.out.println(s);
////                statement.addBatch(s);
//                statement.executeUpdate(s);
//            }
////            statement.executeBatch();
//            System.out.println(statement.toString());
////            statement.clearBatch();
//
//        }
        if (reSet.get(0).size() != 0){
            String sql2 = executeReplaceWsclc(reSet.get(0), reSet.get(2), dataSet);
            System.out.println(sql2);
            statement.execute(sql2);

        }
//        System.out.println(reSet.get(0).size());
//        System.out.println(reSet.get(1).size());
        rs_count[0] = reSet.get(0).size();
        rs_count[1] = reSet.get(1).size();
        conn.close();
        return rs_count;
    }
    private int[] connectMySQLGmhxqyz(ArrayList<StringBuilder> dataSet, ArrayList<ArrayList<String>> checkSet, String fileType) throws ClassNotFoundException, SQLException, NullPointerException {
        MysqlConnect connect = new MysqlConnect();
        String driver = connect.getDriver();
        String url = connect.getUrl();
        String username = connect.getUsername();
        String password = connect.getPassword();

        Connection conn = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        if (!conn.isClosed()) {
            System.out.println("数据库链接成功！");
        }
        int[] rs_count = new int[2];
        String sql;
        // 创建statement类对象，用来执行SQL语句
        Statement statement = conn.createStatement();
        ArrayList<ArrayList<Integer>> reSet = checkHasExistGmhxqyz(checkSet);
        if(reSet.get(1).size() != 0){
            String sql1 = executeInsertGmhxqyz(reSet.get(1), dataSet);
            System.out.println(sql1);
            statement.execute(sql1);
        }
        if (reSet.get(0).size() != 0){
            String sql2 = executeReplaceGmhxqyz(reSet.get(0), reSet.get(2), dataSet);
            System.out.println(sql2);
            statement.execute(sql2);

        }
        rs_count[0] = reSet.get(0).size();
        rs_count[1] = reSet.get(1).size();
        conn.close();
        return rs_count;
    }


    private Workbook getWorkbook(InputStream in, File file) throws IOException {
        Workbook wb = null;
        if (file.getName().endsWith(EXCEL_XLS)) {  //Excel 2003
            wb = new HSSFWorkbook(in);
        } else if (file.getName().endsWith(EXCEL_XLSX)) {  // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }

    private int getLastRow(Sheet sheet){
        CellReference cellReference = new CellReference("A4");
        boolean flag = false;
        System.out.println("总行数："+(sheet.getLastRowNum()+1));
        for (int i = cellReference.getRow(); i <= sheet.getLastRowNum();) {
            Row r = sheet.getRow(i);
            if(r == null){
                // 如果是空行（即没有任何数据、格式），直接把它以下的数据往上移动
                sheet.shiftRows(i+1, sheet.getLastRowNum(),-1);
                continue;
            }
            flag = false;
            for(Cell c:r){
                if(c.getCellType() != Cell.CELL_TYPE_BLANK){
                    flag = true;
                    break;
                }
            }
            if(flag){
                i++;
            }
            else{//如果是空白行（即可能没有数据，但是有一定格式）
                if(i == sheet.getLastRowNum())//如果到了最后一行，直接将那一行remove掉
                    sheet.removeRow(r);
                else//如果还没到最后一行，则数据往上移一行
                    sheet.shiftRows(i+1, sheet.getLastRowNum(),-1);
            }
        }
        System.out.println("总行数："+(sheet.getLastRowNum()+1));
        return sheet.getLastRowNum()+1;

    }
    String poiExceltoSql(String getString, String localFileName, String localFilePath, String localFileUploadTime, String fileType) throws Exception {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        int[] rs_count = new int[2];
        int updateCount = 0;
        int insertCount = 0;
        ArrayList<StringBuilder> dataSet = new ArrayList<>();
        String xzqhdm;
        String xzqhmc;
        String tjnf;
        String zzjgdm;
        String ssdm;
        String yzcbm;

        try {
            System.out.println(getString);
            String[] fopt = getString.split("\\.");
            String checkFileName = fopt[0].replaceFirst("上传成功! ", "") + "_" + localFileUploadTime + "." + fopt[1];
            System.out.println(checkFileName);
            System.out.println(localFileName);
            System.out.println(localFilePath);
            System.out.println(fopt[0]);
            System.out.println(fopt[1]);
            // 同时支持Excel 2003
            if (checkFileName.equals(localFileName)) {
                File excelFile = new File(localFilePath); // 创建文件对象
                FileInputStream fis = new FileInputStream(excelFile); // 文件流
                Workbook workbook = getWorkbook(fis, excelFile);
                //Workbook workbook = WorkbookFactory.create(is); // 这种方式 Excel2003/2007/2010都是可以处理的
                int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
                Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet
                sheet.setDisplayGridlines(true);
                int rowStart = 2;
                int rowEnd = getLastRow(sheet);
                Row row_title = sheet.getRow(1);
                int max_column = row_title.getLastCellNum();
                System.out.println(max_column);
                ArrayList<ArrayList<String>> checkSet = new ArrayList<>();
                for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
                    ArrayList<String> checkField = new ArrayList<>();
                    Row row = sheet.getRow(rowNum);
                    row.createCell(max_column).setCellValue("end_flag");//设置结尾标识符
                    StringBuilder rowValue = new StringBuilder();
                    StringBuilder rowString;
                    for (int cn = 1; cn <= max_column; cn++) {

                        Cell cell = row.getCell(cn, Row.RETURN_BLANK_AS_NULL);
                        String cellValue = "";
                        if (cell == null) {
                            cellValue = "\"\",";
                            rowValue.append(cellValue);
                        } else {

                            int cellType = cell.getCellType();
                            switch (cellType) {
                                case Cell.CELL_TYPE_STRING:
                                    cellValue = '"' + cell.getRichStringCellValue().getString().replace("\n","") + '"' + ',';
                                    break;
                                case Cell.CELL_TYPE_NUMERIC:    // 数字、日期
                                    if (DateUtil.isCellDateFormatted(cell)) {
                                        cellValue = fmt.format(cell.getDateCellValue()) + ",";
                                    } else {
                                        cell.setCellType(Cell.CELL_TYPE_STRING);
                                        cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    }
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:    // 布尔型
                                    cellValue = String.valueOf(cell.getBooleanCellValue()) + ",";
                                    break;
                                case Cell.CELL_TYPE_BLANK: // 空白
                                    cellValue = '"' + cell.getStringCellValue() + '"' + ",";
                                    break;
                                case Cell.CELL_TYPE_ERROR: // 错误
                                    cellValue = "错误#";
                                    break;
                                case Cell.CELL_TYPE_FORMULA:    // 公式

                                    cell.setCellType(Cell.CELL_TYPE_STRING);
                                    cellValue = String.valueOf(cell.getRichStringCellValue().getString()) + ",";
                                    break;
                                default:
                                    cellValue = ",";
                            }

                            rowValue.append(cellValue);
                        }

                    }
                    switch (fileType) {
                        case "wsclc":
                            rowString = new StringBuilder(rowValue.toString().replace("\"end_flag\",", "") + "\"0\"");
                            xzqhdm = rowString.toString().split(",")[0];
                            xzqhmc = rowString.toString().split(",")[1];
                            tjnf = rowString.toString().split(",")[2];
                            zzjgdm = rowString.toString().split(",")[3];
                            ssdm = rowString.toString().split(",")[5];
                            checkField.add(xzqhdm);
                            checkField.add(xzqhmc);
                            checkField.add(tjnf);
                            checkField.add(zzjgdm);
                            checkField.add(ssdm);
                            System.out.println(checkField);
                            checkSet.add(checkField);
                            dataSet.add(rowString);
                            System.out.println(rowString);
                            break;
                        case "zpqy":
                            rowString = new StringBuilder(rowValue.toString().replace("\"\",\"end_flag\",", "") + "\"0\"");
                            xzqhdm = rowString.toString().split(",")[0];
                            xzqhmc = rowString.toString().split(",")[1];
                            tjnf = rowString.toString().split(",")[2];
                            zzjgdm = rowString.toString().split(",")[3];
                            checkField.add(xzqhdm);
                            checkField.add(xzqhmc);
                            checkField.add(tjnf);
                            checkField.add(zzjgdm);
                            checkSet.add(checkField);
                            dataSet.add(rowString);
                            break;
                        case "gmhxqyz":
                            rowString = new StringBuilder(rowValue.toString().replace("\"end_flag\",", "") + "\"0\"");
                            xzqhdm = rowString.toString().split(",")[0];
                            xzqhmc = rowString.toString().split(",")[1];
                            tjnf = rowString.toString().split(",")[2];
                            yzcbm = rowString.toString().split(",")[3];
                            checkField.add(xzqhdm);
                            checkField.add(xzqhmc);
                            checkField.add(tjnf);
                            checkField.add(yzcbm);
                            checkSet.add(checkField);
                            dataSet.add(rowString);
                            break;
                    }
                }
                System.out.println("dataSet:");
                System.out.println(dataSet);

                switch (fileType) {
                    case "zpqy":
                        rs_count = connectMySQLZpqy(dataSet, checkSet, fileType);
                        break;
                    case "wsclc":
                        rs_count = connectMySQLWsclc(dataSet, checkSet, fileType);
                        break;
                    case "gmhxqyz":
                        rs_count = connectMySQLGmhxqyz(dataSet, checkSet, fileType);
                        break;
                }
                    updateCount = rs_count[0];
                    insertCount = rs_count[1];
                    System.out.println("更新了" + updateCount + "条信息");
                    System.out.println("新增了" + insertCount + "条信息");
            } else {
                return "文件不存在，请重新上传！";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "文件批量导入成功 " + updateCount + " " + insertCount;
    }

//    public static void main(String args[]) throws Exception {
//        String OriFileName = "2015年.xls";
//        String localFileName = "2015年_20170817161503.xls";
//        String localFilePath = "D:\\EnvironmentalProtection\\EnvironmentalProtection\\src\\main\\java\\com\\eliteams\\quick4j\\web\\controller\\2015年_20170817161503.xls";
//        String localFileUploadTime = "20170817161503";
//        String fileType = "zpqy";
//        String sa = new poiExcelPoll().poiExceltoSql(OriFileName, localFileName, localFilePath, localFileUploadTime, fileType);
//        System.out.println(sa);
//
//    }
}
