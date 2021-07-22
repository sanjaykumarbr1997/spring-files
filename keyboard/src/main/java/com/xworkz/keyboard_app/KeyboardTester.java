package com.xworkz.keyboard_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.keyboard_app.bean.KeyboardBean;

public class KeyboardTester {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KeyboardConfig.class);
		KeyboardBean kBean = applicationContext.getBean(KeyboardBean.class);
		System.out.println(kBean);

	}

}
