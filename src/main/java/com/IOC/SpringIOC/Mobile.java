package com.IOC.SpringIOC;
//import org.springframework.boot.SpringApplication;
import org.springframework.context.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


//@SpringBootApplication
public class Mobile {

	public static void main(String[] args)
	{
		//SpringApplication.run(SpringIocApplication.class, args);
		/* //Manual Creation of Objects
		Airtel airtel = new Airtel();
		airtel.incoming();
		airtel.outgoing();

		Vodaphone vodaphone = new Vodaphone();
		vodaphone.incoming();
		vodaphone.outgoing();
		*/

		/*
		Sim sim = new Airtel();
		sim.incoming();
		sim.outgoing();
		*/

		/*
		Sim sim = new Vodaphone();
		sim.incoming();
		sim.outgoing();
		*/


		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");

		  /*
		  Airtel air = (Airtel) context.getBean("airtel");
		  air.incoming();
		  air.outgoing();

		  Vodaphone voda = (Vodaphone) context.getBean("vodaphone");
		  voda.incoming();
		  voda.outgoing();
		  */

		  //To avoid Typecasting
		  /*
		  Airtel air = context.getBean("airtel",Airtel.class);
		  air.outgoing();
		  air.incoming();

		  Vodaphone voda = context.getBean("vodaphone",Vodaphone.class);
		  voda.outgoing();
		  voda.incoming();
		  */

		Sim s = context.getBean("sim",Sim.class);
		s.incoming();
		s.outgoing();

	}

}
