package com.xworkz.coffee_powder;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffee_powder.dto.CoffeeDTO;
import com.xworkz.coffee_powder.service.CoffeeService;

public class CoffeeTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Enter:");
		System.out.println("\"1\" to add new data");
		System.out.println("\"2\" to fetch all data");
		System.out.println("\"3\" to get details by name");
		System.out.println("\"4\" to update price by name");
		System.out.println("\"5\" to delete deteils by name");

		
		int number = scanner.nextInt();
		CoffeeDTO cDTO = new CoffeeDTO();
		
		switch (number) {
		case 1:System.out.println("Enter details to save");
				System.out.println("Enter name");
				cDTO.setName(scanner.next());
				System.out.println("Enter price");
				cDTO.setPrice(scanner.nextFloat());
				System.out.println("Enter quantity in gm");
				cDTO.setQuantity(scanner.nextInt());
				CoffeeService cService = applicationContext.getBean(CoffeeService.class);
				cService.validateAndSave(cDTO);
		
			break;
			
		
		case 2:System.out.println("Fetching all details");
			CoffeeService coService = applicationContext.getBean(CoffeeService.class);
			List<CoffeeDTO> cDTOs = coService.fetchAllDetails();
			cDTOs.forEach(System.out::println);
			
			break;
			
		case 3:System.out.println("Enter Name");
			CoffeeService cofService = applicationContext.getBean(CoffeeService.class);
			CoffeeDTO cfDTO = cofService.getDetailsByName(scanner.next());
			System.out.println(cfDTO);

			break;
			
		case 4:System.out.println("Enter name and price to update price");
			CoffeeService coffService = applicationContext.getBean(CoffeeService.class);
			coffService.updatePriceByName(scanner.next(),scanner.nextFloat());
			System.out.println("Details updated");
		break;
		
		case 5:System.out.println("Enter name to delete details");
			CoffeeService coffeService = applicationContext.getBean(CoffeeService.class);
			coffeService.validateAndDeleteByName(scanner.next());
			System.out.println("Details deleted");
		

		}
		
		
		

	}

}
