package com.xworkz.graphic_card;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.graphic_card.dto.GraphicCardDTO;
import com.xworkz.graphic_card.service.GraphicCardService;

public class GraphicCardTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//BasicConfigurator.configure();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Enter:");
		System.out.println("\"1\" to add new data");
		System.out.println("\"2\" to fetch all data");
		System.out.println("\"3\" to get details by name");
		System.out.println("\"4\" to update price by name");
		System.out.println("\"5\" to delete deteils by name");

		
		int number = scanner.nextInt();
		
		switch (number) {
		case 1:System.out.println("Enter details to save data");
					GraphicCardDTO gDTO = new GraphicCardDTO();
					System.out.println("Enter name of graphic card");
					gDTO.setName(scanner.next());
					System.out.println("Enter price of graphic card");
					gDTO.setPrice(scanner.nextFloat());
					System.out.println("Enter version of graphic card");
					gDTO.setVersion(scanner.next());
		
					//GraphicCardService gService = new Grap;

					
					GraphicCardService gService = applicationContext.getBean(GraphicCardService.class);
					gService.validateAndCreateGraphicCardDetails(gDTO);
			
			break;
		case 2:System.out.println("Fetching all details");
					GraphicCardService gServ = applicationContext.getBean(GraphicCardService.class);
					List<GraphicCardDTO> dtoS = gServ.fetchAllDetails();
					dtoS.forEach(System.out::println);
		

			break;
			
		case 3:System.out.println("Enter name to get details");
					GraphicCardService gServi = applicationContext.getBean(GraphicCardService.class);
					GraphicCardDTO gDTOO = gServi.validateAndFetchDetailsByName(scanner.next());
					System.out.println(gDTOO);
			break;
		case 4:System.out.println("Enter name and new price to update ");
				GraphicCardService gServicc = applicationContext.getBean(GraphicCardService.class);
				gServicc.validateAndUpdatePriceByName(scanner.next(),scanner.nextFloat());
				System.out.println("price updated");
			break;
			
		case 5:System.out.println("Enter name to delete details");
		     	GraphicCardService grService = applicationContext.getBean(GraphicCardService.class);
				grService.validateAndDeleteDetailsByName(scanner.next());
				System.out.println("details deleted");
			break;
		}
		

	}

}
