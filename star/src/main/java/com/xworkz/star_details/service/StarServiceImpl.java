package com.xworkz.star_details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.star_details.dao.StarDAO;
import com.xworkz.star_details.dto.StarDTO;

@Component
public class StarServiceImpl implements StarService {
	@Autowired
	private StarDAO sDAO;

	public void save(StarDTO sDTO) {
		if(sDTO!=null) {
			sDAO.save(sDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

}
