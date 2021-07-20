package com.xworkz.coffee_powder.dao;

import java.util.List;

import com.xworkz.coffee_powder.dto.CoffeeDTO;

public interface CoffeeDAO {

	public void save(CoffeeDTO cDTO);

	public List<CoffeeDTO> getAllDetails();

	public CoffeeDTO getDetailsByName(String name);

	public void updatePriceByName(String name,Float price);

	public void deleteDetailsByName(String name);

}
