package com.xworkz.video_player.player;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.video_player.player.bean.PlayerBean;

public class PlayerTester {
	
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring.xml");
		PlayerBean pBean = aContext.getBean(PlayerBean.class);
		System.out.println(pBean);
	}

}
