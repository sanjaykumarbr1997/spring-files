package com.xworkz.airport_terminals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.airport_terminals.beans.AirportBean;
import com.xworkz.airport_terminals.beans.TerminalsBean;

public class AirportTerminalsUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		AirportBean aBean = applicationContext.getBean(AirportBean.class);
		System.out.println(aBean);
		
		TerminalsBean tBean = applicationContext.getBean(TerminalsBean.class);
		System.out.println(tBean);

	}

}
