package com.xworkz.passport_app.service;

import com.google.protobuf.ServiceException;
import com.xworkz.passport_app.dto.PassportDTO;

public interface PassportService {

	public void validateAndSave(PassportDTO pDTO) throws ServiceException;

	
}
