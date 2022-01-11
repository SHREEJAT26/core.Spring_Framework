package com.JDBCConnection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("JDBCConnectionbeans.xml");
        System.out.println("bean.xml file loaded");
        JDBCConnection conn = context.getBean("app.jdbc", JDBCConnection.class);
        conn.displayConnection();

    }
}
