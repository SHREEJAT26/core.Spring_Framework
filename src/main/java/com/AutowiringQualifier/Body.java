package com.AutowiringQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansautowiring.xml");
        Human h = context.getBean("human",Human.class);
        h.startPumping();
    }
}
