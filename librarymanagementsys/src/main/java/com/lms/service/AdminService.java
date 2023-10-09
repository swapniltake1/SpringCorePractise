package com.lms.service;

import java.math.BigDecimal;
import java.util.List;

import com.lms.model.Student;

public interface AdminService {

	List<Student> getAllStudentsWithBorrowedBooks();

	BigDecimal calculateFine(Long studentId);

	Student getStudentById(Long studentId);

}
