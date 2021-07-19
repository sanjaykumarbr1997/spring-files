package com.xworkz.floor_cleaner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.floor_cleaner.beans.FloorCleanerBean;

public class FloorCleanerTester {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean(FloorCleanerBean.class));

	}

}
