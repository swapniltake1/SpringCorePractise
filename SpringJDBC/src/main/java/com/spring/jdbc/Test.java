package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("My programm is started !!");
		
		// Creating object of jdbc templete
		
		ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
		
	   StudentDao studentDao= context.getBean("StudentDao", StudentDao.class);
	   Scanner scanner=new Scanner(System.in);
	   Student student=new Student();
	   boolean flag=false;
	   // Creating menu for operation on database:
	   while(flag==false) {
		   System.out.println("        ");
	   System.out.println(" Please select which operation you want to perform in Database");
	   System.out.println("1: Insert Record in Database   2: Update Record in database ");
	   System.out.println("3: Delete Record Form Database 4: Fetch data from database  ");
	   System.out.println("5: Show all record in Database 6: Exit                      ");
	   
	   int userinput=scanner.nextInt();
	   
	   if(userinput==1) {
	   
	   // Insert Record 
	   System.out.println("Enter ID :");
	   student.setId(scanner.nextInt());
	   System.out.println("Enter Your Name : ");
	   student.setName(scanner.nextLine());
	   System.out.println("Enter Your Address : ");
	   student.setCity(scanner.nextLine());
		
	  int result= studentDao.insert(student);
	  
	  System.out.println( "No of student inserted : " +result);
	  
	
	   }
	   else if (userinput==2) {
	   
	   // Update record in database
	   System.out.println("Enter Id which information u want to update :");
	   student.setId(scanner.nextInt());
	   
	   System.out.println("Enter Your Name we want to update : ");
	   student.setName(scanner.nextLine());
	   
	   System.out.println("Enter Your Address we want to update : ");
	   student.setCity(scanner.nextLine());
	   
	   int change = studentDao.Change(student);
	   
	   System.out.println("Date updated succesfully : " + change);
	   }
	  
	   else if (userinput==3) {
		   
	   // Delete data in dataBASE
	      
	      System.out.println("Enter Id which you want to delete");
	      
	      int delete = studentDao.delete(scanner.nextInt());
	      
	      System.out.println("No of Record deleted succesfully :"+delete);
	      
	   }
	   
	   else if (userinput==4) {
		
	
	   // Retrive single student data 
	   System.out.println("Enter your Id to get information");
	 Student studentdata= studentDao.getStudent(scanner.nextInt());
	 System.out.println(studentdata);
	 
	   }
	   
	   else if (userinput==5) {
		
	
	   // Get all student data
	   System.out.println("All Students : ");
	   List<Student> students=studentDao.getallStudents();
	   for(Student s : students) {
		   System.out.println(s);
	   }
	   }
	   
	   else {
		 System.out.println("Thank You for using our app !! ");
		 scanner.close();
		 flag=true;
	}
	   
	}
	}
}
