package com.book.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

//import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	// @GeneratedValue
	
	@NotNull(message="please enter the Isbn number")
	//@Range(min=2,max=10,message="Please enter isbn number more than 2 digit")
	private Integer isbn;

	@NotEmpty(message = "Book name should not be empty")
	private String bookName;

	@NotBlank(message = "you can't LEAVE this field unfields")
	private String authorName;


	
	@NotNull(message="please enter the Book Price")
	private Double bookPrice;
	private Character isSwitch;

	/*
	 * hashing and equal method
	 * 
	 * 
	 */

	public String getBookName() {
		return bookName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((bookPrice == null) ? 0 : bookPrice.hashCode());
		result = prime * result + ((isSwitch == null) ? 0 : isSwitch.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookPrice == null) {
			if (other.bookPrice != null)
				return false;
		} else if (!bookPrice.equals(other.bookPrice))
			return false;
		if (isSwitch == null) {
			if (other.isSwitch != null)
				return false;
		} else if (!isSwitch.equals(other.isSwitch))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public Character getIsSwitch() {
		return isSwitch;
	}

	public void setIsSwitch(Character isSwitch) {
		this.isSwitch = isSwitch;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName=" + authorName + ", isbn="
				+ isbn + "]";
	}

}
