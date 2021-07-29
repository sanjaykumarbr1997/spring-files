package com.xworkz.passport_app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.passport_app.dto.PassportDTO;

@Repository
public class PassportDAOImpl implements PassportDAO{

	@Autowired
	private SessionFactory factory;
	public void save(PassportDTO pDTO) {
		Session session = null;
		try {


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
	public Boolean verifyDetails(String loginId, String password) {
		
		Session session = null;
		PassportDTO pDTO = null;
		try {
			session = factory.openSession();
			Query qry = session.getNamedQuery("verifyDetails");
			qry.setParameter("lid", loginId);
			qry.setParameter("cpas", password);
			
			
			 pDTO= (PassportDTO) qry.uniqueResult();
			if(pDTO!=null&&pDTO.getLoginId().equalsIgnoreCase(loginId)&& pDTO.getPassword().equalsIgnoreCase(password)) {
				return true;
			}
			else {
				return false;
			}
			
		
			
			
		}catch (HibernateException e) {
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return null;
	}

}
