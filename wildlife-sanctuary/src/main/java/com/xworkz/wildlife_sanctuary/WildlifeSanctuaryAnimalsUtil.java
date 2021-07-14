package com.xworkz.wildlife_sanctuary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.wildlife_sanctuary.beans.AnimalBean;
import com.xworkz.wildlife_sanctuary.beans.WildlifeSanctuayBean;

public class WildlifeSanctuaryAnimalsUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		WildlifeSanctuayBean wBean = applicationContext.getBean(WildlifeSanctuayBean.class);
		System.out.println(wBean);
		
		AnimalBean aBean = applicationContext.getBean(AnimalBean.class);
		System.out.println(aBean);

	}

}
