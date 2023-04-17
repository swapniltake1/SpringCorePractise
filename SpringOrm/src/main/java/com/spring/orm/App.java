package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

import net.bytebuddy.asm.Advice.AllArguments;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter Student Id : "); int id = scanner.nextInt();
		 * 
		 * System.out.println("Enter Student Name : "); String name =
		 * scanner.nextLine();
		 * 
		 * System.out.println("Enter Student City : "); String city =
		 * scanner.nextLine();
		 * 
		 * Student student = new Student(id, name, city);
		 * 
		 * int r = studentDao.insert(student);
		 * 
		 * System.out.println(r);
		 */
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean go=true;
		while (go) {
		System.out.println("******* Welcome TO SpringORM Application ********");
		System.out.println("Press 1 : Add New Students");
		System.out.println("Press 2 : Display All students  ");
		System.out.println("Press 3 : Get details of single student" );
		System.out.println("Press 4 : Delete STudent");
		System.out.println("Press 5 : Update Student");
		System.out.println("Press 6 : Exit");
		
		try {
			      int input = Integer.parseInt(bReader.readLine());
					/*
					 * Using if else statement
					 * if(input==1) {
					 * 
					 * }else if (input==2) {
					 * 
					 * }else if (input==3) {
					 * 
					 * }else if (input==4) {
					 * 
					 * }else if (input==5) {
					 * 
					 * }else {
					 * 
					 * }
					 */
			      switch (input) {
				case 1:
					// Add a new Student
					System.out.println("Enter Student ID : ");
					int uId=Integer.parseInt(bReader.readLine());
					
					
					System.out.println("Enter Student Name : ");
					String uNameString=bReader.readLine();
					
					System.out.println("Enter Student City : ");
					String uCityString=bReader.readLine();
					
					Student student=new Student(uId,uNameString,uCityString);  /// using parameterised cnstructer 
					/* 
					 * Using getter setter
					 * student.setStudentId(uId); 
					 * student.setStudentName(uNameString);
					 * student.setStudentCity(uCityString);
					 */
					
				int r=studentDao.insert(student);
				System.out.println("Added Student ID : "+r);
					break;
					
				case 2:
					// Display all Student
					List<Student> getallStudents = studentDao.getallStudents();
					for(Student st:getallStudents) {
						System.out.println(" Student ID : "+st.getStudentId()+"  Stduent Name : "+st.getStudentName()+"  Student City : "+st.getStudentCity());
					System.out.println("-----------------------------------------------------------------------------");
					}
					break;
					
				case 3:
					// get single Student
					System.out.println("Enter Student ID : ");
					int userId=Integer.parseInt(bReader.readLine());
					Student student2=studentDao.getStudent(userId);
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println(" Student ID : "+student2.getStudentId()+"  Stduent Name : "+student2.getStudentName()+"  Student City : "+student2.getStudentCity());
					System.out.println("-----------------------------------------------------------------------------");
					
					break;
					
				case 4:
				  // Delete 
					System.out.println("Enter Student ID : ");
					int Id=Integer.parseInt(bReader.readLine());
					studentDao.deleteStudent(Id);
					break;
					
				case 5:
					// Update Student
					System.out.println("Enter Student ID (New) : ");
					int uId1=Integer.parseInt(bReader.readLine());
					
					
					System.out.println("Enter Student Name (New) : ");
					String uName=bReader.readLine();
					
					System.out.println("Enter Student City (New) : ");
					String uCity=bReader.readLine();
					
					Student std=new Student(uId1,uName,uCity);  /// using parameterised cnstructer 
					/* 
					 * Using getter setter
					 * std.setStudentId(uId); 
					 * std.setStudentName(uNameString);
					 * std.setStudentCity(uCityString);
					 */
					
				     studentDao.updateStudent(std);
				
					break;

				case 6:
					go=false;
					break;
				}
			      
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Input");
			System.out.println(e.getMessage());
		}
		}
		System.out.println("Thank You for using our application !");
		System.out.println(" See you soon, Have a good day ........Byebye ");
	}
}
