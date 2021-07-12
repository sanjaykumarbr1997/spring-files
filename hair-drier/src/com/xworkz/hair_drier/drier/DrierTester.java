package com.xworkz.hair_drier.drier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hair_drier.drier.bean.DrierBean;

public class DrierTester {
	
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		DrierBean dBean = aContext.getBean(DrierBean.class);
		System.out.println(dBean);
	}

}
