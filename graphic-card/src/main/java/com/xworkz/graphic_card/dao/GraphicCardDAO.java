package com.xworkz.graphic_card.dao;

import java.util.List;

import com.xworkz.graphic_card.dto.GraphicCardDTO;

public interface GraphicCardDAO {
	
	public void createGraphicCard(GraphicCardDTO grDTO);

	public List<GraphicCardDTO> getAllDetails();

	public GraphicCardDTO fetchDetailsByName(String name);

	public void updatePriceByName(String name, float price);
}
