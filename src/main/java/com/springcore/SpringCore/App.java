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
     Student student2=(Student) context.getBean("student2");
     Student student3=(Student) context.getBean("student3");
     Student student4=(Student) context.getBean("student4");
     System.out.println(student1);
     System.out.println(student2);
     System.out.println(student3);
     System.out.println(student4);
    }
}
