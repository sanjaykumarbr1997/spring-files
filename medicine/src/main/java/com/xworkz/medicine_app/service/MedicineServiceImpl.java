package com.xworkz.medicine_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.medicine_app.dao.MedicineDAO;
import com.xworkz.medicine_app.dto.MedicineDTO;
@Service
public class MedicineServiceImpl implements MedicineService{
	
	@Autowired
	private MedicineDAO mDAO;

	public void validateAndSave(MedicineDTO mDTO) {
		if(mDTO!=null) {
			mDAO.save(mDTO);
			
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

}
