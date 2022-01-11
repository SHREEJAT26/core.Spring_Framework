package com.SetterAndConstructor.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam
{
    public static void main(String[] args) {

        /* //MANUAL SETTER INJECTION
        Student student = new Student();
        //student.studentName = "Shreeja Thudhigeni";
        student.setStudentName("Shreeja Oracle");
        student.displayStudentInfo();
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Student s = (Student)context.getBean("student");

        /* //SPRING SETTER INJECTION
        Student s = context.getBean("student",Student.class);
        s.displayStudentInfo();
        Student s2 = context.getBean("shree",Student.class);
        s2.displayStudentInfo();
        */

        /* //MANUAL CONSTRUCTOR INJECTION
        Student student = new Student("Shreeja",100);
        student.displayStudentInfo();
        */

        /* //SPRING CONSTRUCTOR INJECTION
        Student s = context.getBean("student",Student.class);
        s.displayStudentInfo();
        Student s2 = context.getBean("student2",Student.class);
        s2.displayStudentInfo();
        */


    }
}
