package com.smartclean.deekshith.services.demo.dao;

import java.util.List;


import com.smartclean.deekshith.services.demo.model.Services;

public interface ServiceOperationsDAO {
	List<Services> getAllServices();

	void createService(Services service);


	void clearServicebyGivenId(String id);


	Services getGetTheService(String id);

}
