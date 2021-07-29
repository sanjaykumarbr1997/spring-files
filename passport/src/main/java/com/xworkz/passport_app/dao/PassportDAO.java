package com.xworkz.passport_app.dao;

import com.xworkz.passport_app.dto.PassportDTO;

public interface PassportDAO {

	public void save(PassportDTO pDTO);

	public Boolean verifyDetails(String loginId, String password);

}
