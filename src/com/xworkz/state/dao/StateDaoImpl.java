package com.xworkz.state.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.state.dto.StateDto;

public class StateDaoImpl implements StateDao {

	SessionFactory factory;
	
	@Override
	public void save(StateDto dto) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg2.xml");
		
		Session session=null;
		Transaction transaction=null;
		try{
		factory= configuration.buildSessionFactory();
		session=factory.openSession();
		transaction= session.beginTransaction();
		
		session.save(dto);
		transaction.commit();
		}catch(Exception e){
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
