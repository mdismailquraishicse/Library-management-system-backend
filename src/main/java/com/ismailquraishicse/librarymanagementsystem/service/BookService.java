package com.ismailquraishicse.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ismailquraishicse.librarymanagementsystem.dao.BookDao;
import com.ismailquraishicse.librarymanagementsystem.model.Book;


@Service
public class BookService {
 
	
	private BookDao bookDao;
	@Autowired
	public BookService(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}
	
	public List<Book> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	public Optional<Book> getBookById(int id) {
		return bookDao.getBookById(id);
	}
	
	
	public int saveBook(Book book) {
		return bookDao.saveBook(book);
	}
	
	public int deleteAllBooks() {
		return bookDao.deleteAllBooks();
		
	}
	
	public int /* Optional<Integer> */ deleteBookById(int id){
		
		return bookDao.deleteBookById(id);
	}
	
	public int updateBook(int id, Book book) {
		
		return bookDao.updateBook(id, book);
	}
	
	public int returnBook(int bid) {
		return bookDao.returnBook(bid);
	}
	
	
	
}
