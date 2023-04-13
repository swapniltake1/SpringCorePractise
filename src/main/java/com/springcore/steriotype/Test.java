package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config-sterio.xml");
		
		// getting normaly.
		//Student student=context.getBean("student", Student.class);
		
		// getting from @component annotation object
		Student student=context.getBean("ob", Student.class);
		Student student1=context.getBean("ob", Student.class);
		
		System.out.println(student);
		
		System.out.println(student.getAddressList());
		System.out.println(student.getAddressList().getClass().getName());
		
		System.out.println(student.hashCode());
		
		// Singleton Object 
		System.out.println(student1.hashCode());
		
		System.out.println("*************");
		teacher t1 =context.getBean("teacher", teacher.class);
		teacher t2 =context.getBean("teacher", teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
