package com.dashboard;


import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicacionMain {
	public static void main(String[] args) {

		String[] springConfig  = 
			{	
				"application-context.xml" 
			};

	      System.out.println(new Date() + " Servicio pre activo");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(springConfig);
		
      System.out.println(new Date() + " Servicio activo");
	}
}
