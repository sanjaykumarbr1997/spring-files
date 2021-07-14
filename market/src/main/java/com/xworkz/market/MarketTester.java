package com.xworkz.market;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.market.bean.MarketBean;

public class MarketTester {
	public static void main(String[] args) {
		
	
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
	MarketBean mBean = applicationContext.getBean(MarketBean.class);
	System.out.println(mBean);
	
	Integer intege = (Integer) applicationContext.getBean("inte");
	System.out.println(intege);
	}
}
