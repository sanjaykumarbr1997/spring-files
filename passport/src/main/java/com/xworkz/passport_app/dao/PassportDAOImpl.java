package com.xworkz.passport_app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.dto.PassportLoginDTO;

@Repository
public class PassportDAOImpl implements PassportDAO{

	@Autowired
	private SessionFactory factory;
	public void save(PassportDTO pDTO) {
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			session.save(pDTO);
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
