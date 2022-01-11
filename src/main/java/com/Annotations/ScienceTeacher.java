package com.Annotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Hi Iam your Science Teacher");
    }
}
