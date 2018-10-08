package com.book.service;

import java.util.List;

import com.book.Model.Book;

public interface BookService {
	 public boolean save(Book book);
	 public Book findByid(int id);
	 public List<Book> fiandall();
	 public int delete(int id);
	 public boolean update(Book book);
	 public List<Book> advSearch(String searchValue);
}
