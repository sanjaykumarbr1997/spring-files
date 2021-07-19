package com.xworkz.jet_details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.jet_details.bean.JetBean;

public class JetTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean(JetBean.class));

	}

}
