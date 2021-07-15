package com.xworkz.tv_remote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tv_remote.beans.RemoteBean;
import com.xworkz.tv_remote.beans.TVBean;

public class TVRemoteUtil {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		TVBean tBean = applicationContext.getBean(TVBean.class);
		System.out.println(tBean);
		
		RemoteBean rBean = applicationContext.getBean(RemoteBean.class);
		System.out.println(rBean);
	}

}
