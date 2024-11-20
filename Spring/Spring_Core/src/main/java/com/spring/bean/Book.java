package com.spring.bean;

import java.util.List;
import java.util.Map;

public class Book {
	
	private Map<String, String> books;
	private List<Author> authors;
	
	public Book() {
		super();
	}
	
	public Book(Map<String, String> books, List<Author> authors) {
		super();
		this.books = books;
		this.authors = authors;
	}
	
	public Map<String, String> getBooks() {
		return books;
	}
	
	public void setBooks(Map<String, String> books) {
		this.books = books;
	}
	
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	@Override
	public String toString() {
		return "Book [books=" + books + ", authors=" + authors + "]";
	}

}
