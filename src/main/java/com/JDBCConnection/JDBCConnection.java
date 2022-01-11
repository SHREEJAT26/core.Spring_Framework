package com.JDBCConnection;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection
{
    @Value("${app.jdbc.url}")
    private String url;

    @Value("${app.jdbc.username}")
    private String userName;

    @Value("${app.jdbc.password}")
    private String password;

    @Value("${app.jdbc.driverClassName}")
    private String driverClassName;

    public void displayConnection()
    {
        System.out.println(url+""+userName+"/"+password+"@"+driverClassName);
    }

}
