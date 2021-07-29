package com.xworkz.passport_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.passport_app.dao.PassportDAO;
import com.xworkz.passport_app.dto.PassportDTO;

@Service
public class PassportServiceImpl implements PassportService{
	@Autowired
	private PassportDAO pDAO;

	public void validateAndSave(PassportDTO pDTO) {
		if(pDTO!=null) {
			pDAO.save(pDTO);
			
		}
		else {
			System.out.println("dto cant be null");
		}
		
	}

	public Boolean validateAndVerifyDetails(String loginId, String password) {
		if(!loginId.isEmpty()&&!password.isEmpty()) {
			return pDAO.verifyDetails(loginId,password);
		}
		else {
			System.out.println("Name or password cant be empty");
		}
		return null;
	}
	

}
