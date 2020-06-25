package com.smartclean.deekshith.services.demo.service;

import java.util.List;


import com.smartclean.deekshith.services.demo.model.Services;

public interface ServiceOperationsService {
	List<Services> getAllServices();

	void createService(Services service);

	

	void clearServicebyGivenId(String id);

	

	Services getGetTheService(String id);

}
