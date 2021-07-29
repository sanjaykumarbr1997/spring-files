package com.xworkz.passport_app.service;

import com.xworkz.passport_app.dto.PassportDTO;

public interface PassportService {

	public void validateAndSave(PassportDTO pDTO);

	public Boolean validateAndVerifyDetails(String loginId, String password);

}
