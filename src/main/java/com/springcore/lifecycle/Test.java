package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hieee Test Class ");
		
	  AbstractApplicationContext context =	new ClassPathXmlApplicationContext("config-lifecycle.xml");
	                             context.registerShutdownHook(); /// To enable destroy method when we used xml based lifecycle
	       
	         System.out.println("-------------------------------------------");
	       
	         Misal misal1=   (Misal) context.getBean("misal1");         // bean lifecycle using xml file
	         System.out.println(misal1);
	   
	    
	         System.out.println("-------------------------------------------");
	         
	         Lassi lassi = (Lassi) context.getBean("lassi1");        //bean lifecycle using interface
	         System.out.println(lassi);
	         
	         System.out.println("-------------------------------------------");
	         
	        VadaPao vadaPao= (VadaPao) context.getBean("vadapao");   ///bean lifecycle using java @notations
	        System.out.println(vadaPao);
	        
	         System.out.println("-------------------------------------------");
	   
	}

}
