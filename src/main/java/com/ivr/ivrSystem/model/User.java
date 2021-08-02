package com.ivr.ivrSystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String id;
	private String name;
	private String phone;
	private List<IVRCall> ivrCall = new ArrayList<IVRCall>();

	public User(String name, String phone) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.phone = phone;
	}
	public User() {
		
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<IVRCall> getIvrCall() {
		return ivrCall;
	}

	public void setIvrCall(List<IVRCall> ivrCall) {
		this.ivrCall = ivrCall;
	}

}
