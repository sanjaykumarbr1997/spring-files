package com.xworkz.sim_card;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.xworkz.sim_card.bean.SimCardBean;

public class SimCardTester {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		InputStream iS = new FileInputStream("resources/spring.xml");
		
		BeanFactory bFactory = new XmlBeanFactory((Resource)iS);
		SimCardBean sBean =bFactory.getBean(SimCardBean.class);
		System.out.println(sBean);
		SimCardBean sBean1 =bFactory.getBean(SimCardBean.class);
		System.out.println(sBean1);
		*/
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		SimCardBean sBean =applicationContext.getBean(SimCardBean.class);
		System.out.println(sBean);
		
		SimCardBean sBean1 =applicationContext.getBean(SimCardBean.class);
		System.out.println(sBean1);
		
		
		
		
		 

	}

}
