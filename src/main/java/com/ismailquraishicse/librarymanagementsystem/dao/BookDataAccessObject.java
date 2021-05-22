package com.ismailquraishicse.librarymanagementsystem.dao;

import java.util.List;
import java.util.Optional;

import com.ismailquraishicse.librarymanagementsystem.model.Book;

public interface BookDataAccessObject {

	public List<Book> getAllBooks();
	
	Optional<Book> getBookById(int id);
	
	public int saveBook(Book book);
	
	public int deleteAllBooks();
	
	public int /* Optional<Integer> */ deleteBookById(int id);
	
	public int updateBook(int id, Book book);
	
	public int returnBook(int bid);
}
