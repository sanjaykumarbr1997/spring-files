package com.xworkz.ketchup_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.ketchup_app.bean.KetchupBean;

public class KetchupTester {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KetchupConfig.class);
		KetchupBean kBean = applicationContext.getBean(KetchupBean.class);
		System.out.println(kBean);
		

	}

}
