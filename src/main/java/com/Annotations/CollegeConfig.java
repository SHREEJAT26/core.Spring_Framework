package com.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.Annotations")
@PropertySource("classpath:College-info.properties")
public class CollegeConfig
{


/*

    //Interface
    public Teacher mathTeacherBean()
    {
        return new MathTeacher();
    }

    @Bean
    //Class
    public Princpal princpalBean()
    {
        return new Princpal();
    }

    @Bean
    //Here method name is the Bean name
    //@Bean(name={"collg","collegeBeanAnother"})-->These are default names
    public College collegeBean()
    {
        College college = new College();
        college.setPrincpal(princpalBean());//Injecting Princpal Object in College Object using Setter Injection
        college.setTeacher(new MathTeacher());
        return college;
        //return new College(princpalBean());//Injecting Princpal Object in College Object using Constructor Injection

    }

*/



}
