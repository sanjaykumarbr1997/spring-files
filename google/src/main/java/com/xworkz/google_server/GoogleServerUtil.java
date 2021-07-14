package com.xworkz.google_server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.google_server.bean.GoogleBean;
import com.xworkz.google_server.bean.ServerBean;

public class GoogleServerUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		GoogleBean gBean = applicationContext.getBean(GoogleBean.class);
		System.out.println(gBean);
		
		ServerBean sBean = applicationContext.getBean(ServerBean.class);
		System.out.println(sBean);

	}

}
