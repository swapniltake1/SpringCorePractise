package com.lms.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Student;
import com.lms.repository.BookRepository;
import com.lms.repository.StudentRepository;
import com.lms.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService  {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudentsWithBorrowedBooks() {
		List<Student> bb = studentRepository.findByborrowedBookIsNotNull();
		return bb;
	}

	@Override
	public BigDecimal calculateFine(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Student getStudentById(Long studentId) {
		// TODO Auto-generated method stub
	 return studentRepository.getById(studentId);
	}

	
}
