package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Test Class ");
		
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("config-collections.xml");
	 Emp emp1= (Emp) context.getBean("emp1");
	 
	 System.out.println(emp1.getName());
	 System.out.println(emp1.getPhones());
	 System.out.println(emp1.getAddress());
	 System.out.println(emp1.getCourses());
	 System.out.println(emp1.getProps());
		
	}

}
