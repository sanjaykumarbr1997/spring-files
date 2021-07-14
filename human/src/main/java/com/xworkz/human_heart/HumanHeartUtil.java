package com.xworkz.human_heart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.human_heart.bean.HeartBean;
import com.xworkz.human_heart.bean.HumanBean;

public class HumanHeartUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		HumanBean hBean = applicationContext.getBean(HumanBean.class);
		System.out.println(hBean);
		System.out.println(hBean.getHeart().getSize());
		
		HeartBean heBean = applicationContext.getBean(HeartBean.class);
		System.out.println(heBean);
		System.out.println(heBean);

	}

}
