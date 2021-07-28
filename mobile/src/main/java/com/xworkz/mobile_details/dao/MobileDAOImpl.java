package com.xworkz.mobile_details.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile_details.dto.MobileDTO;

@Component
public class MobileDAOImpl implements MobileDAO{
	
	@Autowired
	private SessionFactory factory;
	


	public void save(MobileDTO mDTO) {
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



	public void updateColorByName(String name, String color) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query qry =session.getNamedQuery("updateColor");
			qry.setParameter("cl", color);
			qry.setParameter("nams", name);
			qry.executeUpdate();
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



	public void deleteByName(String name) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query qry =session.getNamedQuery("deleteName");
			qry.setParameter("nam", name);
			qry.executeUpdate();
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
