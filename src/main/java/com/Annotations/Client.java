package com.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args) {

        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationbeans.xml");
        College c = context.getBean("collegeObject",College.class);
        System.out.println("Config Loaded");
        System.out.println("The College Object is : "+c);
        */
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College c = context.getBean("college",College.class);
        System.out.println("Config Loaded");
        System.out.println("The College Object is : "+c);
        c.test();
        ((AnnotationConfigApplicationContext)context).close();

    }
}
