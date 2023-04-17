package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Ref Test Class ");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config-ref.xml");
		A ref= (A) context.getBean("refA");
		System.out.println(ref.getX());
		System.out.println(ref.getOb().getY());
		System.out.println(ref);
		// Declaring second type 
	    A ref1 = (A) context.getBean("refc");
	    System.out.println(ref1);
		
	}
}
