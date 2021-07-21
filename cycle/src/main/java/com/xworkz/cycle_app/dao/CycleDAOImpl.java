package com.xworkz.cycle_app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.xworkz.cycle_app.dto.CycleDTO;

@Component
public class CycleDAOImpl implements CycleDAO {
	@Autowired
	SessionFactory factory;
	public void save(CycleDTO cDTO) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(cDTO);
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
