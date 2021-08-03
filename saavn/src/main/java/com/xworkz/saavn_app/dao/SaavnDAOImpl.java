package com.xworkz.saavn_app.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

@Repository
@Transactional
public class SaavnDAOImpl implements SaavnDAO{
	@Autowired
	private SessionFactory factory;
	public void save(SaavnRegistrationDTO sDTO) {
		factory.getCurrentSession().save(sDTO);	
	}

}
