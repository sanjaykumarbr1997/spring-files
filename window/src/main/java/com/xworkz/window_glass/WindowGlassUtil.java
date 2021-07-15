package com.xworkz.window_glass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.window_glass.beans.GlassBean;
import com.xworkz.window_glass.beans.WindowBean;

public class WindowGlassUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		WindowBean wBean = applicationContext.getBean(WindowBean.class);
		System.out.println(wBean);
		
		GlassBean gBean = applicationContext.getBean(GlassBean.class);
		System.out.println(gBean);

	}

}
