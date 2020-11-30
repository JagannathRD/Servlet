package com.xworkz.flipkart.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.flipkart.dto.ServletFlipkartDTO;

public class FlipkartImpl implements FlipkartInterface{

	SessionFactory factory=null;
	
	@Override
	public void postOrders(ServletFlipkartDTO dto) {
		Session session=null;
		Transaction transaction=null;
		try{
			 
		Configuration configuration= new Configuration();
		configuration.configure();
		factory=configuration.buildSessionFactory(); 
		session=factory.openSession();
		transaction=session.beginTransaction();
		
		session.save(dto);
		transaction.commit();
		}catch(Exception e){
			transaction.rollback();
				
		}finally {
			if(session !=null)
				session.close();
			if(factory!=null)
				factory.close();
		}
		
	}
	
	

}
