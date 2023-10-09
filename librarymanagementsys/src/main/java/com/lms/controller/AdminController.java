package com.lms.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.model.Book;
import com.lms.model.Student;
import com.lms.service.AdminService;
import com.lms.service.Bookservice;
import com.lms.service.StudentService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    private AdminService adminService;
	
	@Autowired
	private Bookservice bookservice;
	
	@Autowired
	private StudentService studentService;

    @GetMapping("/borrowed-books")
    public String viewBorrowedBooks(Model model) {
        List<Student> studentsWithBooks = adminService.getAllStudentsWithBorrowedBooks();
        model.addAttribute("studentsWithBooks", studentsWithBooks);
        return "admin/borrowed-books";
    }
    
    @GetMapping("/student-info/{studentId}")
    public String viewStudentInfo(@PathVariable Long studentId, Model model) {
        Student student = adminService.getStudentById(studentId);
        // Retrieve fine, phone, and email information here
        BigDecimal fine = adminService.calculateFine(studentId);
        // Assuming you have a method to retrieve phone and email information
        String phone = student.getPhoneNumber();
        String email = student.getEmail();
        
        model.addAttribute("student", student);
        model.addAttribute("fine", fine);
        model.addAttribute("phone", phone);
        model.addAttribute("email", email);
        
        return "admin/student-info";
    }
    
    @GetMapping("/adminlogin")
    public String adminPage() {
        return "admin/admin";
    }
    
        @GetMapping("/students")
        public String viewAllStudents(Model model) {
            List<Student> getallStudents = studentService.getallStudents();
            model.addAttribute("student", getallStudents);
            return "student/allstudents";
        }

        @GetMapping("/books")
        public String listBooks(Model model) {
            List<Book> books = bookservice.getAllBooks(); // Replace with your service method
            model.addAttribute("books", books);
            return "admin/books-list";
        }

        @GetMapping("/add-book")
        public String addBookForm() {
            return "admin/add-book";
        }
        
        @PostMapping("/add-book")
        public String addBook(@ModelAttribute("book") Book book) {
        	bookservice.addbook(book);
            return "redirect:/admin/books";
        }

    }
    

