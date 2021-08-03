package com.xworkz.passport_app.dao;

import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.exception.DAOException;

public interface PassportDAO {

	public void save(PassportDTO pDTO) throws DAOException;

	

}
