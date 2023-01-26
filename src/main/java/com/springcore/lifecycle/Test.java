package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hieee Test Class ");
		
	  AbstractApplicationContext context =	new ClassPathXmlApplicationContext("config-lifecycle.xml");
	  Misal misal1=   (Misal) context.getBean("misal1");
	  
	   System.out.println(misal1);
	   
	   context.registerShutdownHook();  /// To enable destroy method when we used xml based lifecycle
	   
	         Lassi lassi = (Lassi) context.getBean("lassi1");
	         
	         System.out.println(lassi);
	   
	}

}
