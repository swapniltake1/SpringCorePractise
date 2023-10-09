package com.lms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lms.model.BookTransaction;

@Repository
public interface BookTransactionRepository extends JpaRepository<BookTransaction, Long>{

	// static List<BookTransaction> findOverdueBorrowings(LocalDate now);
	
	@Query("SELECT bt FROM BookTransaction bt WHERE bt.returnDate < :currentDate")
    List<BookTransaction> findOverdueBorrowings(LocalDate currentDate);

}
