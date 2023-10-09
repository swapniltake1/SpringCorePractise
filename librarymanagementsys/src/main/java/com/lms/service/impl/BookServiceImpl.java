package com.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Book;
import com.lms.repository.BookRepository;
import com.lms.service.Bookservice;

@Service
public class BookServiceImpl implements Bookservice {

	@Autowired
	private BookRepository bookRepository;
	private Book id;
	
	
	
	@Override
	public void addbook(Book book) {
		bookRepository.save(book);
		System.out.println("book saved succesfully...");
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Book getBookById(Long bookId) {
		id = bookRepository.getById(bookId);
		System.out.println("Book Id ::"+id);
		return id;
	}

}
