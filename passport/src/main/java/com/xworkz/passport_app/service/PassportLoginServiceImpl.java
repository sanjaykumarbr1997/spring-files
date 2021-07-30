package com.xworkz.passport_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.passport_app.dao.PassportLoginDAO;
import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.dto.PassportLoginDTO;

@Service
public class PassportLoginServiceImpl implements PassportLoginService {
	
	@Autowired
	private PassportLoginDAO pDAO;
	
	public PassportDTO validateAndVerify(String loginId, String password) {
		if(loginId!=null&&password!=null) {
			return pDAO.verify(loginId,password);
		}
		else {
			return null;
		}
		
	}

}
