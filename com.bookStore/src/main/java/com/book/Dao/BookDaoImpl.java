package com.book.Dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query;
import com.book.Model.Book;

/*
 * REPOSITORY CLASS
 * Implementing BookDao interface
 * */
@Repository("dao")

public class BookDaoImpl implements BookDao, Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private SessionFactory session;

	/*
	 * SAVE METHOD
	 */
	@Transactional
	public boolean save(Book book) {
		book.setIsSwitch('y');
		//System.out.println(session);
		Serializable ser = session.getCurrentSession().save(book);
		return (ser != null) ? true : false;

	}

	/*
	 * DATA RETRIVE BY ID METHOD
	 * no use //replace by Advance Search
	 */
	@Transactional
	public Book findByid(int id) {

		Book book = (Book) session.getCurrentSession().get(Book.class, id);
		return book;
	}

	/*
	 * LIST ALL BOOK DATA 
	 * method return List 
	 */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = false)
	public List<Book> listAll() {

		TypedQuery<Book> query = session.getCurrentSession().createQuery("from Book where isswitch='y'");
		return query.getResultList();

		// return session.getCurrentSession().createQuery("from bookdata").list();

	}

	/*
	 * DELETE METHOD
	 */
	@Transactional
	public int delete(int id) {
		Query q = session.getCurrentSession().createQuery("update Book set isswitch='n' where isbn=:isbn ");
		q.setParameter("isbn", id);
		int status = q.executeUpdate();
		return status;
	}

	/*
	 * UPDATE BOOK DATA METHOD
	 */
	@Transactional
	public boolean update(Book book) {
		session.getCurrentSession().saveOrUpdate(book);
		boolean f = session != null ? true : false;
		return f;
	}
     /*
      * ADVANCE SEARCH
      * 
      */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = false)
	public List<Book> advSearch(String searchValue) {
        Integer isbn=null;
        Double price=null;
        String bookname=searchValue;
        String authorname=searchValue;
        try {
        	 isbn=Integer.parseInt(searchValue);
        	 price=Double.parseDouble(searchValue);
    
        } catch (Exception e) 
        {
           isbn=null;
           price=null;
        }
        
		TypedQuery<Book> query = session.getCurrentSession().createQuery("from Book where isswitch='y' and bookname='"+bookname+"' or authorname='"+authorname+"' or bookprice="+price+" or isbn="+isbn+"   ");
		return query.getResultList();
		
		// return session.getCurrentSession().createQuery("from bookdata").list();

	}
	
	/*
	 * BOOKDAOIMPL CONSTRUCTOR WITHOUT FIELD
	 */
	public BookDaoImpl() {

	}
}
