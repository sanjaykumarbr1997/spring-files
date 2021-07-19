package com.xworkz.earphone_mic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.earphone_mic.beans.EarphoneBean;

public class EarphoneMicTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean(EarphoneBean.class));

	}

}
