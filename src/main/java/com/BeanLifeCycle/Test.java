package com.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
/*
        StudentDAO s = new StudentDAO();
        s.deleteRecord(400);
        s.selectAllRows();
*/
        //ApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
        //context.registerShutdownHook();
        /*StudentDAO dao = context.getBean("studentDAO",StudentDAO.class);
        System.out.println(dao);
        dao.selectAllRows();
*/
        Hello h = context.getBean("hello",Hello.class);
        h.sample();

        context.registerShutdownHook();
        //context.close();
        //((ClassPathXmlApplicationContext)context).close();
        //TypeCasting because close method is present in ClassPathXmlApplicationContext class
        //close() shutdowns the container



    }
}
