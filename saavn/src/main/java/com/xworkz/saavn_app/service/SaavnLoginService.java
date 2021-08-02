package com.xworkz.saavn_app.service;

import com.xworkz.saavn_app.dto.SaavnLoginDTO;
import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

public interface SaavnLoginService {

	public SaavnRegistrationDTO validateAndVerify(String loginId, String password);

}
