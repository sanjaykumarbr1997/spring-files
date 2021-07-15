package com.xworkz.book_pages.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PagesBean implements Serializable {
	@Value(value = "5")
	private int id;
	@Value(value = "35")

	private int noOfPages;
	
	public PagesBean() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "PagesBean [id=" + id + ", noOfPages=" + noOfPages + "]";
	}
	
	

}
