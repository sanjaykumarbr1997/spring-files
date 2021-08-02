package com.xworkz.saavn_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.saavn_app.dao.SaavnLoginDAO;
import com.xworkz.saavn_app.dto.SaavnLoginDTO;
import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

@Service
public class SaavnLoginServiceImpl implements SaavnLoginService {

	@Autowired
	private SaavnLoginDAO sDAO;
	
	public SaavnRegistrationDTO validateAndVerify(String loginId, String password) {
		if(loginId!=null && password!=null) {
			return sDAO.fetchDetails(loginId,password);
		}
		return null;
	}

}
