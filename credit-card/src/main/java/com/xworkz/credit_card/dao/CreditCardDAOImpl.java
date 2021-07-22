package com.xworkz.credit_card.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.credit_card.dto.CreditCardDTO;

@Component
public class CreditCardDAOImpl implements CreditCardDAO {
	
	@Autowired
	SessionFactory factory;
	public void save(CreditCardDTO cDTO) {
		
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
			else {
				if(session!=null) {
					session.close();
				}
			}
		}
		
	}
	public List<CreditCardDTO> getAllDetails() {
		try {
			return factory.openSession().createQuery("from CreditCardDTO dto").list();
		}catch (HibernateException e) {
			e.printStackTrace();
			
		}finally {
			if(factory.openSession()!=null) {
				factory.openSession().close();
			}
		}
		return null;
	}

}
