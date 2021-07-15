package com.xworkz.book_pages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.book_pages.beans.BookBean;
import com.xworkz.book_pages.beans.PagesBean;

public class BookPagesUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		BookBean bBean = applicationContext.getBean(BookBean.class);
		System.out.println(bBean.getPages().getNoOfPages());
		
		PagesBean pBean = applicationContext.getBean(PagesBean.class);
		System.out.println(pBean);

	}

}
