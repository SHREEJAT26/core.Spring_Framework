package com.SpringValueRequiredAnnotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student
{

    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;

    @Required
    //@Value("${student.name}")
    //@Value("Shreeja")
    /*public void setName(String name) {
        this.name = name;
        System.out.println("Using setName method");
    }*/

    //@Value("${student.interestedCourse}")
    //@Value("Java")
    /*public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
        System.out.println("Using setInterestedCourse method");
    }*/

    //@Value("${student.hobby}")
    //@Value("Drawing")
    /*public void setHobby(String hobby) {
        this.hobby = hobby;
        System.out.println("Using setHobby method");
    }*/
    public void displayStudentInfo()
    {
        System.out.println("Student name is : "+name);
        System.out.println("Student interested course is : "+interestedCourse);
        System.out.println("Student hobby is : "+hobby);
    }
}
