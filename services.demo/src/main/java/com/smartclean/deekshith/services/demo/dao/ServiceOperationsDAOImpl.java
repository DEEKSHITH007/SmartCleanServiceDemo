package com.smartclean.deekshith.services.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartclean.deekshith.services.demo.model.Services;

@Repository
@Transactional
public class ServiceOperationsDAOImpl implements ServiceOperationsDAO {

	@Autowired
	private EntityManager entitymanger;

	@Override
	public List<Services> getAllServices() {
		 Session currentsession = entitymanger.unwrap(Session.class);
		 Query<Services> query = currentsession.createQuery("from Services", Services.class);
		 List<Services> services = query.getResultList();
		return services;
	}

	@Override
	public void createService(Services service) {
		Session currentsession = entitymanger.unwrap(Session.class);
		currentsession.save(service);
	}

	

	@Override
	public void clearServicebyGivenId(String id) {
		Session currentsession = entitymanger.unwrap(Session.class);
		Services serv = currentsession.get(Services.class, id);
		currentsession.delete(serv);
	}

	

	@Override
	public Services getGetTheService(String id) {
		Session currentsession = entitymanger.unwrap(Session.class);
		return currentsession.get(Services.class, id);
	}

}
