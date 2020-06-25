package com.smartclean.deekshith.services.demo.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.smartclean.deekshith.services.demo.model.Services;
import com.smartclean.deekshith.services.demo.service.ServiceOperationsService;

@Controller
public class ServiveOperationsController {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	@Autowired
	private ServiceOperationsService serviceoperationservice;

	@GetMapping("/render")
	public String getGetAllServices(Model model) {
		List<Services> list = serviceoperationservice.getAllServices();
		model.addAttribute("services", list);
		return "services";
	}

	@PostMapping("/create")
	public String createService(Model model) {

		return "createService";
	}

	@GetMapping("/create")
	public String getUniqueIdAfterCreation(Model model) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String createdTime = sdf.format(timestamp);
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(5);
		for (int i = 0; i < 5; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		String UniqueID = sb.toString();
		Services serv = new Services(UniqueID, createdTime);
		serviceoperationservice.createService(serv);
		model.addAttribute("service", serv);
		return "createService";
	}

	@DeleteMapping("/clear/{id}")
	public String clearServicebyGivenId(Model model) {
		return "deletedService";
	}

	@GetMapping("/clear/{id}")
	public String getDeletedId(@PathVariable String id, Model model) {
		serviceoperationservice.clearServicebyGivenId(id);
		model.addAttribute("deletedService", id);
		return "deletedService";
	}

	@GetMapping("/check/{id}")
	public String getGetTheService(@PathVariable String id, Model model) {
		Services service = serviceoperationservice.getGetTheService(id);
		model.addAttribute("checkedService", service);
		return "checkService";
	}

}
