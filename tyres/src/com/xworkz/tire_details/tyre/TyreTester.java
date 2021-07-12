package com.xworkz.tire_details.tyre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tire_details.tyre.bean.TyreBean;

public class TyreTester {
	
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		TyreBean tBean = aContext.getBean(TyreBean.class);
		System.out.println(tBean);
	}

}
