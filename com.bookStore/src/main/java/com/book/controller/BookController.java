package com.book.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.book.Model.Book;
import com.book.service.BookService;

/*
 *CONTROLLER CLASS 
*/
@Controller
public class BookController {
	@Autowired(required = true)
	private BookService bookstore;

	/*
	 * 
	 * DISPLAY FORM showing the Book Registration page
	 */
	
	@RequestMapping("/addBook")
	public String addBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "bookRegistration";
	}

	/*
	 * SAVE BOOK
	 * 
	 *  this method is for Book Save method and error validation method
	 */

	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public String sucess(@ModelAttribute("book") @Valid Book book, BindingResult rs, Model model) {
		if (rs.hasErrors()) {
			model.addAttribute("book", book);
			return "bookRegistration";
		}

		boolean isSave = bookstore.save(book);
		if (isSave) {
			String bookname = "Your Book '" + book.getBookName() + "' is Store Successfully ";
			model.addAttribute("bookname", bookname);
			model.addAttribute("book", book);
			return "sucess";
		} else {
			return "bookRegistration";
		}
	}

	/*
	 * VIEW ALL BOOK DATA STORE IN DB 
	 * This method return All the Book available in
	 * BookStore in viewbook.jsp
	 */
	@RequestMapping("/viewallBook")
	public String viewAllBook(Book bk, Model model) {
		List<Book> list = bookstore.fiandall();
		model.addAttribute("bk", new Book());
		if (list != null) {
			model.addAttribute("list", list);
			return ("viewbook");
		} else {
			String message = "no book available here";
			model.addAttribute("message", message);
			return ("errorpage");
		}

	}

	/* *****************************************
	 *   this method for normal search which i commented 
	 * because it has no use now this method replace by the AdvanceSearch  
	 * SEARCH
	 * this method return Book data that search by the User
	 
	@RequestMapping("/searchh")
	public String search(HttpServletRequest req, Model model) {
		String isbn = req.getParameter("isbn");

		if (isbn == "" || isbn == null) {
			model.addAttribute("bk", new Book());
			return ("redirect:/viewallBook");
		}
		Book bk = bookstore.findByid(Integer.parseInt(isbn));
		List<Book> booksList = new ArrayList<Book>();
		booksList.add(bk);
		if (booksList == null || booksList.isEmpty() || bk == null) {
			String message = "Sorry no Book is Found ...!";
			model.addAttribute("message", message);
			return "viewbook";
		} else {
			model.addAttribute("list", booksList);
			return "viewbook";
		}
	}  
	************************************************ */

	/*
	 * EDIT 
	 * 
	 * this method use for showing Edit page for book data
	 */
	@RequestMapping("/edit")
	public String editPage(Model model, Book book, HttpServletRequest request) {
		String isbn = request.getParameter("isbn");
		book = bookstore.findByid(Integer.parseInt(isbn));
		List<Book> booksList = new ArrayList<Book>();
		booksList.add(book);
		model.addAttribute("book", book);
		model.addAttribute("list", booksList);
		return "editPage";
	}

	/*
	 * UPADTE
	 * 
	 *  this method use to update book data
	 */

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("book") Book book, Model model) {
		boolean status = bookstore.update(book);
		if (status) {
			String msg = "Book data is update sucessfully";
			model.addAttribute("msg", msg);
			model.addAttribute("book", book);
			return ("sucess");
		}
		return "viewallBook";
	}

	/*
	 * DELETE
	 *  this method is use to delete the record temporally
	 * 
	 */
	@RequestMapping(value = "/delectDetail", method = RequestMethod.POST)
	public String deleteBook(HttpServletRequest request, Model model) {
		int isbn = Integer.parseInt(request.getParameter("delete"));
		int status = bookstore.delete(isbn);
		if (status > 0) {
			String deleteMsg = "Book data is deleted successfully";
			model.addAttribute("deleteMsg", deleteMsg);
			return ("redirect:/viewallBook");
		} else {
			String deleteMsg = "Book data is not deleted successfully";

			model.addAttribute("deleteMsg", deleteMsg);
			return ("redirect:/viewallBook");
		}
	}
		/*
		 * ADVANCE SEARCH 
		 * 
		 * this method will return all record that search by User
		 * */
  	@RequestMapping("/search")
	public String advSearch(Model model, HttpServletRequest request) {
		String searchValue = request.getParameter("searchValue");
		List<Book> list = bookstore.advSearch(searchValue);
		if (list == null || list.isEmpty()) {
			String message = "Sorry no Book is Found ...!";
			model.addAttribute("message", message);
			return "viewbook";
		}
		
		else {			
				model.addAttribute("list", list);
				return ("viewbook");
				}
	}
}
