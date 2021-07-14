package com.xworkz.library_books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.library_books.beans.BooksBean;
import com.xworkz.library_books.beans.LibraryBean;

public class LibraryBooksUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		LibraryBean lBean = applicationContext.getBean(LibraryBean.class);
		System.out.println(lBean);
		
		BooksBean bBean = applicationContext.getBean(BooksBean.class);
		System.out.println(bBean);
	}

}
