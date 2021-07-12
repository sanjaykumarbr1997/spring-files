package com.xworkz.retail_outlets.outlets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.retail_outlets.outlets.bean.OutletsBean;

public class OutletsTester {

	public static void main(String[] args) {
		
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		OutletsBean oBean = aContext.getBean(OutletsBean.class);
		System.out.println(oBean);

	}

}
