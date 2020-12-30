package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dto.ProductDTO;

public class ProductDAOImpl implements ProductDAO{
SessionFactory factory;
	
	public void save(ProductDTO dto) {
		Session session=null;
		Transaction transaction=null;
		try {
			Configuration configuration= new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(ProductDTO.class);
			factory=configuration.buildSessionFactory();
			session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}finally {
			if(session!=null){
				session.close();
			}
			if(factory!=null){
				factory.close();
			}
		}
		
	}

}
