package com.eliteams.quick4j.web.util;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * 封装了数据库使用。
 * 使用方式从上到下看看就知道了。
 *
 */
public class DBUtil {

    private String mysqlDriver = "com.mysql.jdbc.Driver";
    private String mysqlurl = "jdbc:mysql://localhost:3306";
    private Connection connection = null;
    private MapRepeatable repeatMap = null;
    private ResultSet resultSet = null;
    private String user = null;
    private String password = null;

    public DBUtil(){
        mysqlDriver = "com.mysql.jdbc.Driver";
        mysqlurl = "jdbc:mysql://localhost:3306/new_env";
        user = "root";
        password = "981225";
    }


    public DBUtil(String mysqlDriver,String mysqlurl,String user,String password){
        this.mysqlDriver = mysqlDriver;
        this.mysqlurl = mysqlurl;
        this.user = user;
        this.password = password;
    }

    /**
     * 1.初始化数据库连接
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Connection initConnection() throws ClassNotFoundException, SQLException {
        Class.forName(mysqlDriver);
        this.connection = DriverManager.getConnection(mysqlurl,user,password);
        return connection;
    }

    /**
     * 2.增加限制map，可以没有
     * @param repeatMap
     */
    public void setRepeatMap(MapRepeatable repeatMap) {
        this.repeatMap = repeatMap;
    }

    /**
     * 2.增加限制条件，可以没有
     * @param key
     * @param value
     */
    public void addCritical(Integer key,String value){
        if(key==null||value==null)return;
        if (this.getRepeatMap() == null) {
            this.setRepeatMap(new MapRepeatable(new LinkedList(),key,value));
        }else{
            this.repeatMap.add(key,value);
        }

    }


    /**
     * 3.需要先设置connection和repeatMap
     * 获取连接结果集，需要自己调用来关闭数据库连接。
     * @return
     */
    public ResultSet doResultSet(String sql) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.connection.prepareStatement(sql);
            this.completeStatement(preparedStatement);
            return this.resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 需要先设置connection和repeatMap
     * 这个方法被废弃，因为关闭连接后，ResultSet也将被废弃。
     * @return
     */
    public ResultSet doResultSetwithClose(String sql){
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            this.completeStatement(preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                this.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return this.resultSet;
    }

    /**
     * 完成sqlstatement的补全，并自动查询结果值。
     * 内部工具方法，不用看。
     * @param preparedStatement
     * @throws SQLException
     */
    private void completeStatement(PreparedStatement preparedStatement) throws SQLException {
        if (this.repeatMap != null) {
            Iterator it = this.repeatMap.iterator();
            while (it.hasNext()){
                KeyValue kv = (KeyValue) it.next();
                preparedStatement.setString(kv.getKey(),kv.getValue());
            }
        }
        this.resultSet = preparedStatement.executeQuery();
    }

    /**
     * 关闭数据库连接
     * @throws SQLException
     */
    public void closeConnection() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
        this.connection=null;
    }


//    public static void main(String[] args) {
//        DBUtil dbUtil = new DBUtil();
//        try {
//            dbUtil.initConnection();
//            System.out.println("连接成功！");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("连接失败！");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("连接失败！");
//        }
//    }

    public MapRepeatable getRepeatMap() {
        return repeatMap;
    }

    /**
     * 获取数据库连接
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Connection getConnection() {
        return this.connection;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMysqlDriver() {
        return mysqlDriver;
    }

    public void setMysqlDriver(String mysqlDriver) {
        this.mysqlDriver = mysqlDriver;
    }

    public String getMysqlurl() {
        return mysqlurl;
    }

    public void setMysqlurl(String mysqlurl) {
        this.mysqlurl = mysqlurl;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
