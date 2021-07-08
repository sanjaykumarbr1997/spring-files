package com.xworkz.operating_systems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.operating_systems.bean.OSBean;

public class OSTester {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		OSBean osBean = appContext.getBean(OSBean.class);
		System.out.println(osBean);
		osBean.displayAllOS();
		
		
	}

}
