package com.xworkz.curd_bacteria;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.curd_bacteria.beans.BacteriaBean;
import com.xworkz.curd_bacteria.beans.CurdBean;

public class CurdBacteriaUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		CurdBean cBean = applicationContext.getBean(CurdBean.class);
		System.out.println(cBean);
		
		BacteriaBean bBean = applicationContext.getBean(BacteriaBean.class);
		System.out.println(bBean);

	}

}
