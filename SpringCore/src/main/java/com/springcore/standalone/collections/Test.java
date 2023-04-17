package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config-standalone.xml");
		                   
		        Person person1=context.getBean("person1",Person.class);
		        
		        System.out.println(person1);
		        
		        System.out.println("-------------------------------------------");
		        
		        System.out.println(person1.getFriendStrings().getClass().getName()); // checking the collection class is define or another ?
		        
		        System.out.println("-------------------------------------------");
		        
		        
		        Person person2=context.getBean("person2",Person.class);
		        System.out.println(person2);
		        
		        System.out.println("-------------------------------------------");
		        
		        Institute institute=context.getBean("collage",Institute.class);
		        System.out.println(institute);		                   
		

	}

}
