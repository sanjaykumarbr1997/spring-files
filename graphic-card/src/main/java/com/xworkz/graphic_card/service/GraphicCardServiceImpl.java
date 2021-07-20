package com.xworkz.graphic_card.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.graphic_card.dao.GraphicCardDAO;
import com.xworkz.graphic_card.dto.GraphicCardDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class GraphicCardServiceImpl implements GraphicCardService {
	
	@Autowired
	private GraphicCardDAO gDAO;

	public void validateAndCreateGraphicCardDetails(GraphicCardDTO gDTO) {
		if(gDTO!=null) {
			gDAO.createGraphicCard(gDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
	}

	@Override
	public List<GraphicCardDTO> fetchAllDetails() {
		return gDAO.getAllDetails();
	}

	@Override
	public GraphicCardDTO validateAndFetchDetailsByName(String name) {
		return gDAO.fetchDetailsByName(name);
	}

	@Override
	public void validateAndUpdatePriceByName(String name, float price) {
		if(name!=null) {
			gDAO.updatePriceByName(name,price);
		}
		else {
			System.out.println("name cant be null");
		}
		
	}

	@Override
	public void validateAndDeleteDetailsByName(String name) {
		if(name!=null) {
			gDAO.deleteDetailsByName(name);
		}
		else {
			System.out.println("name cant be null");
		}
	}

}
