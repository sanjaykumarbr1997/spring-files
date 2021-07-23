package com.xworkz.video_game.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.video_game.dto.VideoGameDTO;

@Component
public class VideoGameDAOImpl implements VideoGameDAO {
	
	@Autowired
	 SessionFactory factory;

	public void save(VideoGameDTO vDTO) {
		Session session= null;
		
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(vDTO);
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
