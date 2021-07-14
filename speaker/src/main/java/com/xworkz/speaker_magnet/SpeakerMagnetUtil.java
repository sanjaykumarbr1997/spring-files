package com.xworkz.speaker_magnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.speaker_magnet.beans.MagnetBean;
import com.xworkz.speaker_magnet.beans.SpeakerBean;

public class SpeakerMagnetUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		MagnetBean mBean = applicationContext.getBean(MagnetBean.class);
		System.out.println(mBean);
		
		SpeakerBean sBean = applicationContext.getBean(SpeakerBean.class);
		System.out.println(sBean);

	}

}
