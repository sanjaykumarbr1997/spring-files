package com.xworkz.pen_ink;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.pen_ink.beans.InkBean;
import com.xworkz.pen_ink.beans.PenBean;

public class PenInkUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		PenBean pBean = applicationContext.getBean(PenBean.class);
		System.out.println(pBean);
		
		InkBean iBean = applicationContext.getBean(InkBean.class);
		System.out.println(iBean);
		
		

	}

}
