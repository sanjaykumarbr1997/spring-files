package com.xworkz.satellite_details.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.satellite_details.dto.SatelliteDTO;
@Repository
public class SatelliteDAOImpl implements SatelliteDAO{
	
	@Autowired
	private SessionFactory factory;

	public void save(SatelliteDTO sDTO) {
		
		Session session = null;
		try {
			session= factory.openSession();
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
