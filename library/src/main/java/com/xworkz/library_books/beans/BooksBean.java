package com.xworkz.library_books.beans;

import java.io.Serializable;

public class BooksBean implements Serializable {
	private int id;
	private String name;
	private String author;
	@Override
	public String toString() {
		return "BooksBean [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	public BooksBean() {
		System.out.println(this.getClass().getSimpleName()+"created");
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
