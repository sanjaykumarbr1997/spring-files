package com.xworkz.music_instruments;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.music_instruments.dto.MusicInstrumentsDTO;
import com.xworkz.music_instruments.service.MusicInstrumentsService;

public class MusicInstrumentsTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Enter details to save");
		MusicInstrumentsDTO mDTO = new MusicInstrumentsDTO();
		System.out.println("Enter name");
		mDTO.setName(scanner.next());
		System.out.println("Enter price");
		mDTO.setPrice(scanner.nextFloat());
		System.out.println("Enter color");
		mDTO.setColor(scanner.next());
		
		MusicInstrumentsService mService = applicationContext.getBean(MusicInstrumentsService.class);
		mService.validateAndSave(mDTO);
		System.out.println("Details saved");
	}

}
