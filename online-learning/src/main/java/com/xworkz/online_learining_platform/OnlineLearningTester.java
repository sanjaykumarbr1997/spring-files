package com.xworkz.online_learining_platform;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.online_learining_platform.bean.OnlineLearningBean;

public class OnlineLearningTester {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println(applicationContext.getBean(OnlineLearningBean.class));
	}

}
