package com.xworkz.passport_app.service;

import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.dto.PassportLoginDTO;

public interface PassportLoginService {



	public PassportDTO validateAndVerify(String loginId, String password);

}
