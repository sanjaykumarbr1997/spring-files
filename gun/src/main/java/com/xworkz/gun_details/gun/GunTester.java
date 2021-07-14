package com.xworkz.gun_details.gun;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.gun_details.gun.bean.GunBean;

public class GunTester {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		GunBean gBean = applicationContext.getBean(GunBean.class);
		System.out.println(gBean);
		
		
		String [] ar = gBean.getOtherGuns();
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.binarySearch(ar, "UMP"));
		
		
	}

}
