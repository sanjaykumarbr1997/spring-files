package com.xworkz.passport_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.ServiceException;
import com.xworkz.passport_app.dao.PassportDAO;
import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.exception.DAOException;

@Service
public class PassportServiceImpl implements PassportService{
	@Autowired
	private PassportDAO pDAO;

	public void validateAndSave(PassportDTO pDTO) throws ServiceException {
		try {
		if(pDTO!=null&&!pDTO.getSurName().isEmpty()) {
			pDAO.save(pDTO);
			
		}
		
		
	}catch (DAOException e) {
		e.printStackTrace();
		throw new ServiceException(e.getMessage());
	} catch (Exception e) {
		e.printStackTrace();
		throw new ServiceException(e.getMessage());
	}
	

	
	}

}
