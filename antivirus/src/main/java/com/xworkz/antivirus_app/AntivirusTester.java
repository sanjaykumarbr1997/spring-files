package com.xworkz.antivirus_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.antivirus_app.bean.AntivirusBean;

public class AntivirusTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean(AntivirusBean.class));

	}

}
