package com.ObjectInjection.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args) {

        /*
        Student student = new Student();
        //Manual Object Injection using Constructor
        //MathCheat mathcheat = new MathCheat();
        //student.setMath(mathcheat);
        //student.setMath(new MathCheat());
        student.cheating();
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("bean.xml file loaded");

        Student s = context.getBean("student",Student.class);
        s.cheating();

        Student2 s2 = context.getBean("student2",Student2.class);
        s2.startCheacting();



    }
}
