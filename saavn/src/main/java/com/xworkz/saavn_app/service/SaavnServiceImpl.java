package com.xworkz.saavn_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.saavn_app.dao.SaavnDAO;
import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

@Service
public class SaavnServiceImpl implements SaavnService {
	
	@Autowired
	private SaavnDAO sDAO;

	public void validateAndSave(SaavnRegistrationDTO sDTO) {
		if(sDTO!=null) {
			sDAO.save(sDTO);
		}
		else {
			System.out.println("DTO Cant be null");
		}
	}

}
