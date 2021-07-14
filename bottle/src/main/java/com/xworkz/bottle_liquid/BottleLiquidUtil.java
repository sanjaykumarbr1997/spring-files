package com.xworkz.bottle_liquid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bottle_liquid.bean.BottleBean;
import com.xworkz.bottle_liquid.bean.LiquidBean;

public class BottleLiquidUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		BottleBean bBean= applicationContext.getBean(BottleBean.class);
		System.out.println(bBean);
		
		LiquidBean lBean = applicationContext.getBean(LiquidBean.class);
		System.out.println(lBean);

	}

}
