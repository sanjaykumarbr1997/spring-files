package com.xworkz.laptop_storage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop_storage.bean.HardDiskBean;
import com.xworkz.laptop_storage.bean.LaptopBean;

public class LaptopUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		LaptopBean lBean = applicationContext.getBean(LaptopBean.class);
		System.out.println(lBean.getId());
		System.out.println(lBean);
		
		HardDiskBean hBean = applicationContext.getBean(HardDiskBean.class);
		System.out.println(hBean.getHardDiskId());
		System.out.println(hBean);
	}

}
