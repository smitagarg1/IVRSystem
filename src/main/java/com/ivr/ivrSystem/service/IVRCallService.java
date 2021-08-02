package com.ivr.ivrSystem.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivr.ivrSystem.model.IVRCall;
import com.ivr.ivrSystem.repository.IVRCallRepository;

@Service
public class IVRCallService {

	
	
	@Autowired
	IVRcallTemplate ivRcallTemplate;

	public Map<String,String> ivrCall(String phone, String name) throws Exception {
		Map<String,String> options=new HashMap<String, String>();
		boolean anyActiveCall = false;
		if (IVRCallRepository.userCallMap.containsKey(phone)) {
			List<IVRCall> userIvrCalls = IVRCallRepository.userCallMap.get(phone).getIvrCall();
			for(IVRCall call:userIvrCalls) {
				if(call.isIvrActive()) {
					anyActiveCall=true;
				}
			}

		}
		
		if(anyActiveCall) {
			 options.put("Message", "User already has an active call");
		}
		
		else {
			options=ivRcallTemplate.call(phone, name);
			
			
		}
		return options;
	}

	
	public Object selectMainMenu(String options ,String phone) throws Exception {
		ivRcallTemplate.selectConnectionOption(options,phone);
		return null;
	}
}
