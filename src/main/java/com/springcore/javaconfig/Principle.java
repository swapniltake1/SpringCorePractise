package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//Configuration based on xml file 
	///	ApplicationContext context = new ClassPathXmlApplicationContext("config-java.xml");
		
		//Annotation based config
     	ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaConfig.class);
			
		
	Student student=	context1.getBean("getStudent", Student.class);
		
	System.out.println(student);
	student.study();
	}

}
