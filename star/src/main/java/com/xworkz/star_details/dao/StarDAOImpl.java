package com.xworkz.star_details.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.star_details.dto.StarDTO;

@Component
public class StarDAOImpl  implements StarDAO{
	
	@Autowired
	SessionFactory factory;

	public void save(StarDTO sDTO) {
		Session session = null;
		try {
			session = factory.openSession();
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
