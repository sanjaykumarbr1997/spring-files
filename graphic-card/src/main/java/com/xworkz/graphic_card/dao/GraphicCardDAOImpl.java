package com.xworkz.graphic_card.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.graphic_card.dto.GraphicCardDTO;

import lombok.NoArgsConstructor;


@Component
//@NoArgsConstructor
public class GraphicCardDAOImpl implements GraphicCardDAO{
	
	@Autowired
	private SessionFactory factory;
	public void createGraphicCard(GraphicCardDTO grDTO) {
	
		Session session = null;
		try {
			
			session= factory.openSession();
			session.beginTransaction();
			session.save(grDTO);
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
	

	@Override
	public List<GraphicCardDTO> getAllDetails() {
		Session session = null;
		try {
			session = factory.openSession();
			return session.getNamedQuery("getAllDetails").list();
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
	public GraphicCardDTO fetchDetailsByName(String name) {
		Session session = null;
		try {
			session = factory.openSession();
			return (GraphicCardDTO) session.getNamedQuery("fetchDetailsByName").setParameter("nam", name).uniqueResult();
			//return 
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
	public void updatePriceByName(String name, float price) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query qry = session.getNamedQuery("updatePriceByName");
			qry.setParameter("naa", name);
			qry.setParameter("prr", price);
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


	@Override
	public void deleteDetailsByName(String name) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			
			session.getNamedQuery("deleteDetailsByName").setParameter("naam", name).executeUpdate();
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
