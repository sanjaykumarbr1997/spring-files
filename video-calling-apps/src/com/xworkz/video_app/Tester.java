package com.xworkz.video_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.video_app.bean.VideoAppBean;

public class Tester {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		VideoAppBean vBean = applicationContext.getBean(VideoAppBean.class);
		System.out.println(vBean);
		vBean.displayAll();
		
	}

}
