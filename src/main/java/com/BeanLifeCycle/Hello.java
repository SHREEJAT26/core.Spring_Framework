package com.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean
{

    /*public void init()
    {
        System.out.println("init method called");
    }
    public void destroy()
    {
        System.out.println("destroy method called");
    }*/

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Inside afterPropertiesSet method -- init ");
    }

    public void sample()
    {
        System.out.println("My code starts here and ends here ");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Inside destroy method -- destroy");
    }

}
