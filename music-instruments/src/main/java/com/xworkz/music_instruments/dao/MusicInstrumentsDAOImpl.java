package com.xworkz.music_instruments.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.music_instruments.dto.MusicInstrumentsDTO;

@Component
public class MusicInstrumentsDAOImpl implements MusicInstrumentsDAO{
	
	@Autowired
	SessionFactory factory;

	public void save(MusicInstrumentsDTO mDTO) {
		
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
			
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
		
	}

}
