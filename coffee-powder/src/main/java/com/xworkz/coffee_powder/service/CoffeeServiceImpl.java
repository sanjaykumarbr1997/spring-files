package com.xworkz.coffee_powder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffee_powder.dao.CoffeeDAO;
import com.xworkz.coffee_powder.dto.CoffeeDTO;

@Component

public class CoffeeServiceImpl implements CoffeeService {
	@Autowired
	private CoffeeDAO cDAO;

	public void validateAndSave(CoffeeDTO cDTO) {
		if(cDTO!=null) {
			cDAO.save(cDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

	@Override
	public List<CoffeeDTO> fetchAllDetails() {
		return cDAO.getAllDetails();
	}

	@Override
	public CoffeeDTO getDetailsByName(String name) {
		if(name!=null) {
		return cDAO.getDetailsByName(name);
		}
		else {
			System.out.println("name cant be null");
		}
		return null;
	}

	@Override
	public void updatePriceByName(String name,Float price) {
		if(name!=null) {
			cDAO.updatePriceByName(name,price);
			}
			else {
				System.out.println("name cant be null");
			}
		
		
		
	}

	@Override
	public void validateAndDeleteByName(String name) {
		if(name!=null) {
			cDAO.deleteDetailsByName(name);
			}
			else {
				System.out.println("name cant be null");
			}
		
		
	}

}
