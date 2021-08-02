package com.ivr.ivrSystem.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ivr.ivrSystem.model.BroadbandConnection;
import com.ivr.ivrSystem.model.Connection;
import com.ivr.ivrSystem.model.IVRCall;
import com.ivr.ivrSystem.model.IVROptions;
import com.ivr.ivrSystem.model.PostpaidConnection;
import com.ivr.ivrSystem.model.PrepaidConnection;
import com.ivr.ivrSystem.model.User;
import com.ivr.ivrSystem.repository.IVRCallRepository;


@Service
public class IVRcallTemplate {

	public Map<String, String> call(String phone, String name) {

		
		User user =null;
			
			 
			 Map<String,String> options=new HashMap<>();
			 options.put(IVROptions.ONE.toString(), "PostPaid");
			 options.put(IVROptions.TWO.toString(), "PREPAID");
			 options.put(IVROptions.THREE.toString(), "BROADBAND");
			 
			 IVRCall ivarCall=new IVRCall(LocalDateTime.now().toString(), null, true);
			
			 if (IVRCallRepository.userCallMap.containsKey(phone)) {
					user=IVRCallRepository.userCallMap.get(phone);
					
					user.getIvrCall().add(ivarCall);
				}
				else {
					
					 user =new User(name, phone);
					List<IVRCall> call=new ArrayList();
					 call.add(ivarCall);
					 user.setIvrCall(call);
					 IVRCallRepository.userCallMap.put(phone, user);
					
		}
			 
			 return options;
	}

	public void selectConnectionOption(String options ,String phone) {
		Connection connection=null;
		if(IVROptions.ONE.toString().equalsIgnoreCase(options)) {
			connection =new PostpaidConnection();
			connection.goToNextMenu();
		}
		
		else if(IVROptions.TWO.toString().equalsIgnoreCase(options)) {
			connection =new PrepaidConnection();
			connection.goToNextMenu();
		}
		
		else if(IVROptions.THREE.toString().equalsIgnoreCase(options)) {
			connection =new BroadbandConnection();
			connection.goToNextMenu();
		}

	}

	public void goToPreviousMenu() {

	}

	public void goToNextMenu() {

	}

	
	public void endCall() {
		
	}
}
