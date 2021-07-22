package com.xworkz.ketchup_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.ketchup_app.bean.KetchupBean;

@Configuration
public class KetchupConfig {
	
	/*@Bean
	public KetchupBean getKetchup() {
		KetchupBean bean =new KetchupBean();
		bean.setId(4);
		bean.setName("kISSAN");
		bean.setPrice(100);
		bean.setQuantity(250);
		return bean;
	}*/


	@Bean
	public KetchupBean getKetchup() {
		
		return new KetchupBean();
	}
}
