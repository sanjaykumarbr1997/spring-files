package com.xworkz.coffee_powder.service;

import java.util.List;

import com.xworkz.coffee_powder.dto.CoffeeDTO;

public interface CoffeeService {

	public void validateAndSave(CoffeeDTO cDTO);

	public List<CoffeeDTO> fetchAllDetails();

	public CoffeeDTO getDetailsByName(String name);

	public void updatePriceByName(String name,Float price);

	public void validateAndDeleteByName(String name);

}
