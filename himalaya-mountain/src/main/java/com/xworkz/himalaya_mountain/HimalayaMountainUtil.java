package com.xworkz.himalaya_mountain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.himalaya_mountain.beans.HimalayaBean;
import com.xworkz.himalaya_mountain.beans.MountainBean;

public class HimalayaMountainUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		HimalayaBean hBean = applicationContext.getBean(HimalayaBean.class);
		System.out.println(hBean);
		
		MountainBean mBean = applicationContext.getBean(MountainBean.class);
		System.out.println(mBean);

	}

}
