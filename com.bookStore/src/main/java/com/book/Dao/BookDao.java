package com.book.Dao;

import java.util.List;

import com.book.Model.Book;

public interface BookDao {
 public boolean save(Book book);
 public Book findByid(int id);
 public List<Book> listAll();
 public int delete(int id);
 public boolean update(Book book);
 public List<Book> advSearch(String searchValue);
}
