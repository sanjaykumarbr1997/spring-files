package com.xworkz.vaccination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vaccination.bean.VaccinationBean;

public class VaccinationTester {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		VaccinationBean vBean = applicationContext.getBean(VaccinationBean.class);
		System.out.println(vBean);
		
		Float fl = (Float) applicationContext.getBean("flo");
		System.out.println(fl);
	}

}
