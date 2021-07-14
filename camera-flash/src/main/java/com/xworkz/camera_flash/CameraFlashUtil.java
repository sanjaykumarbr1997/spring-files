package com.xworkz.camera_flash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.camera_flash.beans.CameraBean;
import com.xworkz.camera_flash.beans.FlashBean;

public class CameraFlashUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		CameraBean cBean = applicationContext.getBean(CameraBean.class);
		System.out.println(cBean);
		
		FlashBean fBean = applicationContext.getBean(FlashBean.class);
		System.out.println(fBean);

	}

}
