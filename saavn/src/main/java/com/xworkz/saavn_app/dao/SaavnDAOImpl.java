package com.xworkz.saavn_app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;

@Repository
public class SaavnDAOImpl implements SaavnDAO {
	
	@Autowired
	private SessionFactory factory;

	public void save(SaavnRegistrationDTO sDTO) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(sDTO);
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction()!=null) {
				session.getTransaction().rollback();
			}
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}
	
	
	
	

}
