package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.model.Book;
import com.lms.model.Student;
import com.lms.service.Bookservice;
import com.lms.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private Bookservice bookservice;
	
	@GetMapping("/studentlogin")
    public String studentPage() {
        return "student/student";
    }

    @GetMapping("/all-books")
    public String viewAllBooks(Model model) {
    	List<Book> books = bookservice.getAllBooks(); // Replace with your service method
        model.addAttribute("books", books);
        return "admin/books-list";
        
    }
    
    @GetMapping("/borrow-book")
    public String borrowBookForm(Model model) {
        // Implement logic to retrieve a list of available books from your database
        List<Book> availableBooks = bookservice.getAllBooks(); // Replace with your service method
        model.addAttribute("availableBooks", availableBooks);
        return "/student/borrow-book";
    }
    
    @PostMapping("/borrow-book")
    public String borrowBook(@ModelAttribute("student") Student student, @RequestParam("bookId") Long bookId) {
    	Book book = bookservice.getBookById(bookId);
    	// Set the borrowedBook property of the student
        student.setBorrowedBook(book);

        // Save the updated student with the borrowed book
        studentService.addStudent(student);
        System.out.println("Student Saved ");
        
        return "redirect:/student/student";
        
    }


}
