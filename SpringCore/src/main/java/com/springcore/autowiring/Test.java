package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------Test Class -------------");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config-autowiring-xmlbased.xml");
		                  
		                  Emp emp1=context.getBean("emp1",Emp.class);
		                  System.out.println(emp1);
		                  
		                  Emp emp2=context.getBean("emp2",Emp.class);
		                  System.out.println(emp2);
		                  
		                  Emp emp3=context.getBean("emp3",Emp.class);
		                  System.out.println(emp3);
		                  
		                  Emp emp4=context.getBean("emp4",Emp.class);
		                  System.out.println(emp4);

	}

}
