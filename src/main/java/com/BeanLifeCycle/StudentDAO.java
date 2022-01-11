package com.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO
{
    /*
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private String username="system";
    private String password ="system";
    */


    private String driver;
    private String url;
    private String username;
    private String password;
    Connection conn;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver)
    {
        System.out.println("Setting DRIVER");
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url)
    {
        System.out.println("Setting URL");
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username)
    {
        System.out.println("Setting USERNAME");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        System.out.println("Setting PASSWORD");
        this.password = password;
    }


    //@PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        System.out.println("I am inside init() method , it is a custom init() method ");
        createDBConnection();
    }

    //@PostConstruct
    //Annotate a method with @PostConstrtuct to use it as a init() method
    public void createDBConnection() throws ClassNotFoundException, SQLException {
        System.out.println("Creating connection Object");
        //load driver
        Class.forName(driver);

        //get connection
        conn = DriverManager.getConnection(url,username,password);

    }


    public void selectAllRows() throws ClassNotFoundException, SQLException
    {
/*
        //load driver
        Class.forName(driver);

        //get connection
        Connection conn = DriverManager.getConnection(url,username,password);*/

        //createDBConnection();//Calling this method for Initializing conn Object
        // --Can eliminate this by doing @PostConstruct

        //execute query
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from gfg");
        System.out.println("Retrieving all gfg rows");

        while(rs.next())
        {
            int ID = rs.getInt(1);
            String EMPNAME = rs.getString(2);

            System.out.println(ID+"  "+EMPNAME);
        }
       /* //Closing the connection
        conn.close();
*/
    }

    public void deleteRecord(Integer id) throws ClassNotFoundException, SQLException
    {
/*

        //load driver
        Class.forName(driver);

        //get connection
        Connection conn = DriverManager.getConnection(url,username,password);
*/

        //execute query
        Statement stat = conn.createStatement();
        stat.executeUpdate("delete from gfg where id = "+id);
        System.out.println("Record deleted with id :"+id);

     /*   //Closing the connection
        conn.close();
*/
    }

    //@PreDestroy
    public void closeConnection() throws SQLException
    {
        //Clean up job
        //Closing the connection
        conn.close();
    }

    //@PreDestroy
    public void destroy() throws SQLException {
        //Clean up job
        System.out.println("Inside Destroy Method");
        closeConnection();

    }

}
