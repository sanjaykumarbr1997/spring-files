package com.xworkz.monitor_details.monitor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.monitor_details.monitor.bean.MonitorBean;

public class MonitorTester {

	public static void main(String[] args) {
		
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		MonitorBean mBean = aContext.getBean(MonitorBean.class);
		System.out.println(mBean);

	}

}
