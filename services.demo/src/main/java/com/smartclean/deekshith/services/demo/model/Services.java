package com.smartclean.deekshith.services.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "services_entry")
public class Services {

	@Id
	@Column(name="uniqueID")
	private String UniqueID;
	@Column(name="created_time")
	private String created_time;

	public Services() {
		super();
	}

	public Services(String uniqueID, String createdTime) {
		super();
		UniqueID = uniqueID;
		this.created_time = createdTime;
	}

	public String getUniqueID() {
		return UniqueID;
	}

	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}

	public String getCreatedTime() {
		return created_time;
	}

	public void setCreatedTime(String createdTime) {
		this.created_time = createdTime;
	}
//checking the CI
}
