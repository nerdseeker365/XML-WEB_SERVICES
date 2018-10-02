package com.universal.service;

import com.universal.domain.Book;

public class BookServiceConsumer {
	public static void main(String[] args) {
			//create obj for webservice client
			BookServiceImplService service = 
					new BookServiceImplService();
			
			//get port from webservice client
			IBookService port =service.getBookServiceImplPort();
			
			//invoking operation
			Book b = port.searchBook(1001);
			
			//displaying webservice response
			System.out.println(b.getAuthor());
			System.out.println(b.getBookName());
			System.out.println(b.getPrice());
	}
}
