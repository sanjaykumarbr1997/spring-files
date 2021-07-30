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
public class PassportLoginDAOImpl implements PassportLoginDAO{

	@Autowired
	private SessionFactory factory;
	
	
	public PassportDTO verify(String loginId, String password) {
		Session session = null;
		PassportDTO pDTO=null;
		try {
				session = factory.openSession();
				Query qry = session.getNamedQuery("verifyDetails");
				qry.setParameter("lid", loginId);
				qry.setParameter("cpas", password);
				
				
				 pDTO= (PassportDTO) qry.uniqueResult();
				 return pDTO;
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
