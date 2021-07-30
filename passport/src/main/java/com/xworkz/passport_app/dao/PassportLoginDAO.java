package com.xworkz.passport_app.dao;

import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.dto.PassportLoginDTO;

public interface PassportLoginDAO {

	

	public PassportDTO verify(String loginId, String password);

}
