package com.xworkz.coffee_powder.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffee_powder.dto.CoffeeDTO;

@Component
public class CoffeeDAOImpl implements CoffeeDAO {
	@Autowired
	SessionFactory factory;
	
	public void save(CoffeeDTO cDTO) {
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
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
	}

	@Override
	public List<CoffeeDTO> getAllDetails() {
		Session session = null;
		try {
			return factory.openSession().getNamedQuery("getAllDetails").list();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return null;
	}

	@Override
	public CoffeeDTO getDetailsByName(String name) {
		Session session = null;
		try {
			return (CoffeeDTO) factory.openSession().getNamedQuery("getDetailsByName").setParameter("na", name).uniqueResult();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return null;
	}

	@Override
	public void updatePriceByName(String name,Float price) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query qry = session.getNamedQuery("updatePriceByName");
			qry.setParameter("nam", name);
			qry.setParameter("pri", price);
			qry.executeUpdate();
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction()!=null) {
				session.getTransaction().rollback();
			}
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
		
	}

	@Override
	public void deleteDetailsByName(String name) {
		Session session = null;
		try {
			
			session = factory.openSession();
			session.beginTransaction();
			session.getNamedQuery("deleteDetailsByName").setParameter("name", name).executeUpdate();
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction()!=null) {
				session.getTransaction().rollback();
			}
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}

}
