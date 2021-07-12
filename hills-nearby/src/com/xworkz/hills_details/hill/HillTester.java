package com.xworkz.hills_details.hill;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hills_details.hill.bean.HillBean;

public class HillTester {

	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		HillBean hBean = aContext.getBean(HillBean.class);
		System.out.println(hBean);
	}

}
