package com.springcore.SpringCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
     ApplicationContext context=new ClassPathXmlApplicationContext("Config1.xml");
     Student student1=(Student) context.getBean("student1");    // line started with typecasting  
     
     System.out.println(student1);
    }
}
