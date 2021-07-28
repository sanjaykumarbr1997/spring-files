package com.xworkz.satellite_details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.satellite_details.dao.SatelliteDAO;
import com.xworkz.satellite_details.dto.SatelliteDTO;

@Service
public class SatelliteServiceImpl implements SatelliteService {
	
	@Autowired
	private SatelliteDAO sDAO;

	public void validateAndSave(SatelliteDTO sDTO) {
		if(sDTO!=null) {
			sDAO.save(sDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

}
