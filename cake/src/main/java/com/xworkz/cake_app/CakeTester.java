package com.xworkz.cake_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.cake_app.beans.CakeBean;

public class CakeTester {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean(CakeBean.class));
	}

}
