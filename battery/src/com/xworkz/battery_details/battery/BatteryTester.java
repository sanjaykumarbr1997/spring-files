package com.xworkz.battery_details.battery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.battery_details.battery.bean.BatteryBean;

public class BatteryTester {

	public static void main(String[] args) {
		
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		BatteryBean bBean = aContext.getBean(BatteryBean.class);
		System.out.println(bBean);
	}

}
