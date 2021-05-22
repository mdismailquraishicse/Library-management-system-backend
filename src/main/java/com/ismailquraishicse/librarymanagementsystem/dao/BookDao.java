package com.ismailquraishicse.librarymanagementsystem.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.ismailquraishicse.librarymanagementsystem.model.Book;


@Repository
public class BookDao implements BookDataAccessObject{

	List<Book> DB;
	
	
	@Override
	public List<Book> getAllBooks() {

		
		String query = "SELECT * FROM lbooks";
		
		try {
		      DB = null;
		      DB = new ArrayList<Book>();
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Book b = new Book(resultSet.getInt("bid"),
						resultSet.getString("btitle"),
						resultSet.getString("bauthor"),
						resultSet.getDouble("bprice"),
						resultSet.getDate("bissue"),
						resultSet.getDate("breturn"),
						resultSet.getInt("brollno")
						);
				DB.add(b);
			
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		return DB;
	
	}

	@Override
	public Optional<Book> getBookById(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM lbooks WHERE bid="+id;
		Book b = new Book();

		try {
			DB = null;
			DB = new ArrayList<Book>();
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				b.setBid(resultSet.getInt("bid")); 
				b.setBtitle(resultSet.getString("btitle"));		
				b.setBauthor(resultSet.getString("bauthor")); 
				b.setBprice(resultSet.getDouble("bprice"));
				DB.add(b);
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}

		/* jgkjgg */
		return DB.stream().filter(book -> book.getBid()==id).findFirst();
	}

	@Override
	public int saveBook(Book book) {
		String query = "INSERT INTO lbooks(bid,btitle,bauthor,bprice) values(?,?,?,?)";

		try {
			ConnectionDao connectionDao = new ConnectionDao();
			PreparedStatement preparedStatement = connectionDao.conn.prepareStatement(query);
			preparedStatement.setInt(1, book.getBid());
			preparedStatement.setString(2, book.getBtitle());
			preparedStatement.setString(3, book.getBauthor());
			preparedStatement.setDouble(4, book.getBprice());



			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return 1;
	}

	@Override
	public int deleteAllBooks() {
		// TODO Auto-generated method stub
		
		String query = "DELETE FROM lbooks";
		
		try {
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			statement.executeUpdate(query);

			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		
		return 1;
		
	}

	@Override
	public int  /* Optional<Integer> */ deleteBookById(int id) {
		// TODO Auto-generated method stub
		
	String query = "DELETE FROM lbooks WHERE bid="+id;
		
		try {
			ConnectionDao connectionDao = new ConnectionDao();
			Statement statement = connectionDao.conn.createStatement();
			statement.executeUpdate(query);

			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		
		return 1;

	}

	@Override
	public int updateBook(int id, Book book) {
		
		String query = "UPDATE lbooks SET bissue=?, breturn =?,brollno=? WHERE bid=?";
		
		try {
			ConnectionDao connectionDao = new ConnectionDao();
		 PreparedStatement preparedStatement = connectionDao.conn.prepareStatement(query);
			preparedStatement.setDate(1, book.getBissue());
			preparedStatement.setDate(2, book.getBreturn());
			preparedStatement.setInt(3, book.getBrollno());
			preparedStatement.setInt(4, book.getBid());

			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}

		return 1;
	}

	@Override
	public int returnBook(int bid) {
		// TODO Auto-generated method stub
		
String query = "UPDATE lbooks SET bissue=null, breturn =null,brollno=null WHERE bid=?";
		
		try {
			ConnectionDao connectionDao = new ConnectionDao();
		 PreparedStatement preparedStatement = connectionDao.conn.prepareStatement(query);
//			preparedStatement.setDate(1, book.getBissue());
//			preparedStatement.setDate(2, book.getBreturn());
//			preparedStatement.setInt(3, book.getBrollno());
			preparedStatement.setInt(1, bid);

			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}

		return 0;
	}
	
	

}
