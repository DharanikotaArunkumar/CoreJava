package com.companyname.java.generics;

public class Store{
	
	private Book book;     // Problem :- The store can store only Books, here type is hard coded .

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	
}