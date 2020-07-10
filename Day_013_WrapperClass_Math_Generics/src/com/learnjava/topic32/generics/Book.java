package com.learnjava.topic32.generics;

public class Book {
	
	private int pageNumber;
	
	private int lineNumber;

	
	
	public Book(int pageNumber, int lineNumber) {
		super();
		this.pageNumber = pageNumber;
		this.lineNumber = lineNumber;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Override
	public String toString() {
		return "Book [pageNumber=" + pageNumber + ", lineNumber=" + lineNumber + "]";
	}
	
	

}
