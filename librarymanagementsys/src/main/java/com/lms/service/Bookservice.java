package com.lms.service;

import java.util.List;

import com.lms.model.Book;

public interface Bookservice {

	void addbook(Book book);

	List<Book> getAllBooks();

	Book getBookById(Long bookId);

}
