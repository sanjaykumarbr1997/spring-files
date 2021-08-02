package com.xworkz.saavn_app.dao;

import com.xworkz.saavn_app.dto.SaavnLoginDTO;
import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

public interface SaavnLoginDAO {

	public SaavnRegistrationDTO fetchDetails(String loginId, String password);

}
