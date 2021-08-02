package com.xworkz.saavn_app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

@Repository
public class SaavnLoginDAOImpl implements SaavnLoginDAO {

	@Autowired
	private SessionFactory factory;
	SaavnRegistrationDTO dto= null;
	public SaavnRegistrationDTO fetchDetails(String loginId, String password) {
		Session session = null;
		
		try {
			session = factory.openSession();
			Query qry = session.getNamedQuery("fetchDetails");
			qry.setParameter("lid", loginId);
			qry.setParameter("pass", password);
			
			dto =(SaavnRegistrationDTO) qry.uniqueResult();
			return dto;
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return null;
	}

}
