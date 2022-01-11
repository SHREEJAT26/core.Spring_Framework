package com.SpringValueRequiredAnnotation;

import com.ObjectInjection.di.Student2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansValueRequired.xml");
        System.out.println("bean.xml file loaded");
        Student s = context.getBean("student", Student.class);
        s.displayStudentInfo();

    }
}
