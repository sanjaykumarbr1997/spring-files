package com.xworkz.book_pages.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookBean implements Serializable {
	@Value(value = "1")
	private int id;
	@Value(value = "Class mate")
	private String name;
	@Value(value = "50")
	private float price;
	@Autowired
	private PagesBean pages;
	
	public BookBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public PagesBean getPages() {
		return pages;
	}

	public void setPages(PagesBean pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "BookBean [id=" + id + ", name=" + name + ", price=" + price + ", pages=" + pages + "]";
	}

	

	
}
