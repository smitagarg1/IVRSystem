package com.ivr.ivrSystem.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ivr.ivrSystem.model.User;


@Repository
public class IVRCallRepository {

	
	public static Map<String,User> userCallMap=new HashMap<String,User>();

	

}
