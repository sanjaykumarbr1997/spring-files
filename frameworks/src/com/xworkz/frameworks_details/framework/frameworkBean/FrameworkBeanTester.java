package com.xworkz.frameworks_details.framework.frameworkBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.frameworks_details.framework.frameworkBean.bean.FrameworkBean;

public class FrameworkBeanTester {

	public static void main(String[] args) {
		
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		FrameworkBean fBean = aContext.getBean(FrameworkBean.class);
		//FrameworkBean fBean = aContext.getBean(FrameworkBean,class,"frmw");
		//FrameworkBean fBean = (FrameworkBean)aContext.getBean("frmw");
		System.out.println(fBean);
		

	}

}
