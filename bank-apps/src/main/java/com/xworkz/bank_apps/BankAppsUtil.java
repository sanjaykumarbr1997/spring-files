package com.xworkz.bank_apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bank_apps.bean.AppsBean;
import com.xworkz.bank_apps.bean.BankBean;

public class BankAppsUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		BankBean bBean = applicationContext.getBean(BankBean.class);
		System.out.println(bBean);
		System.out.println(bBean.getApp());
		
		AppsBean aBean = applicationContext.getBean(AppsBean.class);
		System.out.println(aBean);
	}

}
