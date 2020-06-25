package com.smartclean.deekshith.services.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartclean.deekshith.services.demo.dao.ServiceOperationsDAO;
import com.smartclean.deekshith.services.demo.model.Services;

@Service
public class ServiceOperationsServiceImpl implements ServiceOperationsService {

	@Autowired
	private ServiceOperationsDAO serviceoperationdao;
	
	@Override
	public List<Services> getAllServices() {
		return serviceoperationdao.getAllServices();
	}

	@Override
	public void createService(Services service) {
		serviceoperationdao.createService(service);
	}

	

	@Override
	public void clearServicebyGivenId(String  id) {
		serviceoperationdao.clearServicebyGivenId(id);
	}

	

	@Override
	public Services getGetTheService(String id) {
		return serviceoperationdao.getGetTheService(id);
	}

	
}
