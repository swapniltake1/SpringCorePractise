package com.lms.service;

import java.util.List;

import com.lms.model.Book;
import com.lms.model.Student;

public interface StudentService {

	 List<Book> getAvailableBooks(); 

	void addStudent(Student student);

	List<Student> getallStudents();

}
