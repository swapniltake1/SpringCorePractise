package com.springcore.constuctorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
	ApplicationContext context=new ClassPathXmlApplicationContext("Config-ConstucterInjection.xml");
	          Person p=(Person) context.getBean("person1");
	          System.out.println(p);
	         
	         System.out.println("Addition of int");
	         Addition add1= (Addition) context.getBean("add1");
	         add1.doSum();
	         
	         System.out.println("Addition of double");
	         Addition add2= (Addition) context.getBean("add2");
	         add2.doSum();
	         
	         System.out.println("Addition of String");
	         Addition add3= (Addition) context.getBean("add3");
	         add3.doSum();
	}

}
