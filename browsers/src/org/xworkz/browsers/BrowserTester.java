package org.xworkz.browsers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xworkz.browsers.bean.BrowserBean;

public class BrowserTester {
	
	public static void main(String[] args) {
		
		ApplicationContext applContext = new ClassPathXmlApplicationContext("spring.xml");
		BrowserBean bBean = applContext.getBean(BrowserBean.class);
		System.out.println(bBean);
		bBean.displayAllBrowser();
	}

}
