package com.xworkz.cycle_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.cycle_app.dao.CycleDAO;
import com.xworkz.cycle_app.dto.CycleDTO;

@Component
public class CycleServiceImpl implements CycleService{
	@Autowired
	private CycleDAO cDAO;

	public void validateAndSave(CycleDTO cDTO) {
		cDAO.save(cDTO);
		
	}

}
