package com.xworkz.programming_languages.languages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.programming_languages.languages.bean.LanguageBean;

public class LanguageTester {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		LanguageBean lBean = appContext.getBean(LanguageBean.class);
		System.out.println(lBean);
	}

}
