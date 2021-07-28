package com.xworkz.mobile_details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile_details.MobileTester;
import com.xworkz.mobile_details.dao.MobileDAO;
import com.xworkz.mobile_details.dto.MobileDTO;


@Component
public class MobileServiceImpl implements MobileSevice {
	
	@Autowired
	private MobileDAO mDAO;
	
	

	public void validateAndSave(MobileDTO mDTO) {
		mDAO.save(mDTO);
		
	}



	public void validateAndUpdate(String name, String color) {
		mDAO.updateColorByName(name,color);
		
	}



	public void validateAndDelete(String name) {
		mDAO.deleteByName(name);
		
	}

}
