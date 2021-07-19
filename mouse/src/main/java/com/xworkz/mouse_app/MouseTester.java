package com.xworkz.mouse_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mouse_app.beans.MouseBean;

public class MouseTester {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean("mus"));
		
	}

}
