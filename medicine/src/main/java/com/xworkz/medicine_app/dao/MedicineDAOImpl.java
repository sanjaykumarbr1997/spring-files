package com.xworkz.medicine_app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.medicine_app.dto.MedicineDTO;

@Repository
public class MedicineDAOImpl implements MedicineDAO {
	
	@Autowired
	SessionFactory factory;

	public void save(MedicineDTO mDTO) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(mDTO);
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
