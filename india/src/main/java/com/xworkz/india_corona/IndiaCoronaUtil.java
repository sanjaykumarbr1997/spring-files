package com.xworkz.india_corona;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.india_corona.beans.CoronaBean;
import com.xworkz.india_corona.beans.IndiaBean;

public class IndiaCoronaUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		IndiaBean iBean = applicationContext.getBean(IndiaBean.class);
		System.out.println(iBean);
		
		CoronaBean cBean = applicationContext.getBean(CoronaBean.class);
		System.out.println(cBean);

	}

}
