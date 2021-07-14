package com.xworkz.zoo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.zoo.bean.ZooBean;

public class ZooTester {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
		ZooBean zBean = (ZooBean) applicationContext.getBean("zo");
		System.out.println(zBean);
		
		Integer integ = (Integer) applicationContext.getBean("inte");
		System.out.println(integ);
		
		String sa = (String) applicationContext.getBean("str");
		System.out.println(sa);
		

	}

}
