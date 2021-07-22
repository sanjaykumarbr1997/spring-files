package com.xworkz.keyboard_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.keyboard_app.bean.KeyboardBean;

@Configuration
@ComponentScan(basePackages="com.xworkz.keyboard_app")
public class KeyboardConfig {
	
	@Bean
	public KeyboardBean getBean() {
		return new KeyboardBean();
	}
	
	
	
	
	

}
