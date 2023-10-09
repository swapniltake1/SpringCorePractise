package com.lms.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.lms.model.BookTransaction;
import com.lms.model.Student;
import com.lms.repository.BookTransactionRepository;
import com.lms.repository.StudentRepository;

@Service
public class FineService {

   
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private BookTransactionRepository bookTransactionRepository;
    
    public static LocalDate getDueDate() {
		// TODO Auto-generated method stub
		 LocalDate currentDate = LocalDate.now();
		    return currentDate.plusDays(5);
	}

    @Scheduled(fixedRate = 24 * 60 * 60 * 1000) // Run daily
    public void calculateFines() {
        // Get all overdue book borrowings
       // List<BookTransaction> overdueBorrowings = BookTransactionRepository.findOverdueBorrowings(LocalDate.now());

    	List<BookTransaction> overdueBorrowings = bookTransactionRepository.findOverdueBorrowings(LocalDate.now());

    	
        for (BookTransaction borrowing : overdueBorrowings) {
            LocalDate dueDate = FineService.getDueDate();
            LocalDate currentDate = LocalDate.now();
            long daysOverdue = ChronoUnit.DAYS.between(dueDate, currentDate);
            if (daysOverdue >= 5) {
                // Calculate the number of 5-day periods that have passed
                long overduePeriods = daysOverdue / 5;

                // Calculate the fine incrementally (100 for every 5 days)
                BigDecimal fineIncrement = BigDecimal.valueOf(overduePeriods * 100);

                Student student = borrowing.getStudent();

                // Get the existing fine (BookTransaction) associated with the student
                BookTransaction fineTransaction = student.getFine();

                // Create a new BookTransaction if one doesn't exist
                if (fineTransaction == null) {
                    fineTransaction = new BookTransaction();
                }

                // Update the fine amount
                fineTransaction.setFineAmount(fineTransaction.getFineAmount().add(fineIncrement));

                // Set the fine back to the student
                student.setFine(fineTransaction);

                // Save the student (which will also save the associated fine transaction)
                studentRepository.save(student);
            }

    }
    }
    
}
