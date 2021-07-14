package com.xworkz.library_books.beans;

import java.io.Serializable;

public class LibraryBean implements Serializable {
	private int id;
	private String name;
	private String location;
	private BooksBean book;
	@Override
	public String toString() {
		return "LibraryBean [id=" + id + ", name=" + name + ", location=" + location + ", book=" + book + "]";
	}
	
	public LibraryBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BooksBean getBook() {
		return book;
	}

	public void setBook(BooksBean book) {
		this.book = book;
	}
	

}
