package com.xworkz.graphic_card.service;

import java.util.List;

import com.xworkz.graphic_card.dto.GraphicCardDTO;

public interface GraphicCardService {

	public void validateAndCreateGraphicCardDetails(GraphicCardDTO gDTO);

	public List<GraphicCardDTO> fetchAllDetails();

	public GraphicCardDTO validateAndFetchDetailsByName(String name);

	public void validateAndUpdatePriceByName(String name, float price);

}
