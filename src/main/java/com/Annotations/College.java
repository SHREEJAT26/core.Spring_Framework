package com.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.Principal;

@Component
//@Component("collegeObject")
//The deafault Object name would same as class name for @Component()
//For example @Component would create bean id with "college" name
public class College
{
    //@Value("University of California")
    //@Value("${college.name}")
    private String collegeName;

    @Autowired
    private Princpal princpal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    @Required
    @Value("${college.name}")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }


/*
    @Autowired
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Autowired
    public void setPrincpal(Princpal princpal) {
        this.princpal = princpal;
        System.out.println("Using Stter method");
    }
*/

    /*
    public College(Princpal princpal) {
        this.princpal = princpal;
    }
    */

    public void test()
    {
        princpal.princpalInfo();
        teacher.teach();
        System.out.println("My college name is : "+collegeName);
        System.out.println("Testing Successfull");
    }
}
