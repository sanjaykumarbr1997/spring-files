package com.xworkz.clock_details.clock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.clock_details.clock.bean.ClockBean;

public class ClockTester {
	
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		ClockBean cBean = aContext.getBean(ClockBean.class);
		System.out.println(cBean);
	}

}
