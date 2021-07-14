package com.xworkz.soap_chemicals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.soap_chemicals.bean.ChemicalsBean;
import com.xworkz.soap_chemicals.bean.SoapBean;

public class SoapChemicalsUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		SoapBean sBean = applicationContext.getBean(SoapBean.class);
		System.out.println(sBean);
		
		ChemicalsBean cBean = applicationContext.getBean(ChemicalsBean.class);
		System.out.println(cBean);

	}

}
