package com.xworkz.saavn_app.dao;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

@Repository
@Transactional
public class SaavnLoginDAOImpl implements SaavnLoginDAO {

	@Autowired
	private SessionFactory factory;
	SaavnRegistrationDTO dto= null;
	public SaavnRegistrationDTO fetchDetails(String loginId, String password) {
	
			dto=(SaavnRegistrationDTO) factory.getCurrentSession().getNamedQuery("fetchDetails").setParameter("lid",loginId ).setParameter("pass", password).uniqueResult();
			return dto;

	}

}
