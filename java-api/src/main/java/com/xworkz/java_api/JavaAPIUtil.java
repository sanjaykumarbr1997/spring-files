package com.xworkz.java_api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.java_api.beans.beans.APIBean;
import com.xworkz.java_api.beans.beans.JavaBean;

public class JavaAPIUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		JavaBean jBean = applicationContext.getBean(JavaBean.class);
		System.out.println(jBean);
		
		APIBean aBean = applicationContext.getBean(APIBean.class);
		System.out.println(aBean);

	}

}
