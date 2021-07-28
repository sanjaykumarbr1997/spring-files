package com.xworkz.engine_details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.engine_details.dao.EngineDAO;
import com.xworkz.engine_details.dto.EngineDTO;

@Service
public class EngineServiceImpl implements EngineService {
	
	@Autowired
	private EngineDAO eDAO;

	public void validateAndSave(EngineDTO eDTO) {
		if(eDTO!=null) {
			eDAO.save(eDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

}
