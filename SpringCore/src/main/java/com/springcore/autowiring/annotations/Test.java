package com.springcore.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("---------Test Class----------");
   
    @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("config-autowiring-annotationbased.xml");
                      Bill bill= context.getBean("bill", Bill.class);
                      System.out.println(bill);
	}

}
