package com.xworkz.mobile_details.service;

import com.xworkz.mobile_details.dto.MobileDTO;

public interface MobileSevice {

	public void validateAndSave(MobileDTO mDTO);

	public void validateAndUpdate(String name, String color);

	public void validateAndDelete(String name);

}
