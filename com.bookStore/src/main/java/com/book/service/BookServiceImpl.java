package com.book.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.Dao.BookDao;
import com.book.Model.Book;

@Service("bookstore")
public class BookServiceImpl implements BookService {

	@Autowired(required = true)
	private BookDao dao;

	public boolean save(Book book) {

		System.out.println("this in service impl" + book.getAuthorName());

		return dao.save(book);

	}

	@Transactional
	public Book findByid(int id) {
		return dao.findByid(id);
	}

	@Transactional
	public List<Book> fiandall() {

		return dao.listAll();
	}
    
	
	@Transactional
	public int delete(int id) {
		return dao.delete(id);
	}
	@Transactional
	public boolean update(Book book) {
		return dao.update(book);
	}
	 @Transactional
	public List<Book> advSearch(String searchValue){
		
	  return dao.advSearch(searchValue);
	}
	public BookServiceImpl(){
		
	}
}
