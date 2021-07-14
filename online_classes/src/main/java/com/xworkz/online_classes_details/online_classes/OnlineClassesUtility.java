package com.xworkz.online_classes_details.online_classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.online_classes_details.online_classes.bean.OnlineClassesBean;

public class OnlineClassesUtility {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		OnlineClassesBean oBean = applicationContext.getBean(OnlineClassesBean.class);
		System.out.println(oBean);

		Integer in = (Integer) applicationContext.getBean("in");
		System.out.println(in);
		System.out.println(System.identityHashCode(in));
	}

}
