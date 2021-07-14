package com.xworkz.country_states;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.country_states.bean.CountryBean;
import com.xworkz.country_states.bean.StatesBean;

public class CountryStatesUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		CountryBean cBean = applicationContext.getBean(CountryBean.class);
		System.out.println(cBean);
		
		StatesBean sBean = applicationContext.getBean(StatesBean.class);
		System.out.println(sBean);

	}

}
