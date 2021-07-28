package com.xworkz.mobile_details.dao;

import com.xworkz.mobile_details.dto.MobileDTO;

public interface MobileDAO {

	public void save(MobileDTO mDTO);

	public void updateColorByName(String name, String color);

	public void deleteByName(String name);

}
