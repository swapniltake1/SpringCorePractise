package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// when we using xml file @ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
   
	public Samosa getSamosa() {
		
		Samosa samosa=new Samosa();
	  return samosa;	
	}
	
	
	@Bean
	public Student getStudent() {
		
		// Creating studnet object
		Student student=new Student(getSamosa());
		
		return student;
	}
	
}
