package com.universal.service;

import javax.jws.WebService;

import com.universal.domain.Book;

@WebService(endpointInterface="com.universal.service.IBookService")
public class BookServiceImpl implements IBookService {

	@Override
	public Book searchBook(int isbn) {
		// business logic goes here

		Book b = new Book();
		b.setIsbn(isbn);
		b.setAuthor("Richard");
		b.setBookName("Webservices");
		b.setPrice(750.00);

		return b;
	}

}
