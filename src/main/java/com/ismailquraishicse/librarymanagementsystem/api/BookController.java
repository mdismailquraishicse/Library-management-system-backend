package com.ismailquraishicse.librarymanagementsystem.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ismailquraishicse.librarymanagementsystem.model.Book;
import com.ismailquraishicse.librarymanagementsystem.service.BookService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/lms/book")
@RestController
public class BookController {

	private	BookService bookService;

    
	
	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
		
	}


 // BOOK'S FUNCTIONS
	@GetMapping()
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping(path ="{id}")
	public Book  getBookById(@PathVariable("id") int id) {
		return bookService.getBookById(id).orElse(null);
	}
	

	
	@PostMapping
	public int saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	

	
	@DeleteMapping
	public int deleteAllBooks() {
		return bookService.deleteAllBooks();
	}
	
	
	@DeleteMapping(path ="{id}")
	public int deleteBookById(@PathVariable("id") int id) {
				
	 return	bookService.deleteBookById(id);	
	}
	
	@PutMapping(path = "{id}")
	public int issueBook(@PathVariable ("id") int id,@RequestBody Book book) {
		book.setBrollno(id);
		return bookService.updateBook(book.getBrollno(), book);
	}
	
	@PostMapping(path = "{bid}")
	public int returnBook(@PathVariable ("bid") int bid) {
		return bookService.returnBook(bid);
	}
	


}
