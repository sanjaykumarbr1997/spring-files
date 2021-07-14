package com.xworkz.cricket_player;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.cricket_player.beans.CricketBean;
import com.xworkz.cricket_player.beans.PlayersBean;

public class CricketPlayersUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		CricketBean cBean = applicationContext.getBean(CricketBean.class);
		System.out.println(cBean);
		
		PlayersBean pBean = applicationContext.getBean(PlayersBean.class);
		System.out.println(pBean);

	}

}
