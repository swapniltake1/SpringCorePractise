package com.lms.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Book;
import com.lms.model.BookTransaction;
import com.lms.model.Student;
import com.lms.repository.BookTransactionRepository;
import com.lms.repository.StudentRepository;
import com.lms.service.Bookservice;
import com.lms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private Bookservice bookservice;
	@Autowired
	private BookTransactionRepository bookTransactionRepository;
	@Autowired
	private FineService fineService;
	
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	   System.out.println("Student saved service");
	   BookTransaction bookTransaction = new BookTransaction();
	   bookTransaction.setStudent(student); // Set the student
	 //  bookTransaction.setBook(book); // Set the book
	   bookTransaction.setBorrowDate(LocalDate.now()); // Set the borrow date
	   bookTransaction.setReturnDate(FineService.getDueDate()); // Set the return date
	   bookTransactionRepository.save(bookTransaction); // Save the transaction

	}

	@Override
	public List<Book> getAvailableBooks() {
		List<Book> allBooks = bookservice.getAllBooks();
		return allBooks;
	}

	@Override
	public List<Student> getallStudents() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
		
	}

}
