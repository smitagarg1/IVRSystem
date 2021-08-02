package com.ivr.ivrSystem.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ivr.ivrSystem.service.IVRCallService;

@RestController

@RequestMapping("/ivr")
public class IVRCallController {

	@Autowired
	IVRCallService ivrCallService;

	@RequestMapping(value = "/ivrCall", method = RequestMethod.GET)
	public ResponseEntity<Object> ivrCall(@RequestParam String phone,String name) {

		try {
			
			Map<String,String> options =new HashMap<String, String>();
			options=ivrCallService.ivrCall(phone,name);

			return new ResponseEntity<>(options, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}

	}
	
	
	
	  @RequestMapping(value = "/selectMainMenu", method = RequestMethod.POST)
	  public ResponseEntity<Object> selectMainMenu(@RequestParam String
	  options,String phone) {
	  
	  try {
	  
	  //Map<String,String> options =new HashMap<String, String>();
	//  options=ivrCallService.selectMainMenu(options,phone);
	  
	  return new ResponseEntity<>(options, HttpStatus.OK); } catch (Exception e) {
	  return new ResponseEntity<>(e.getMessage(), HttpStatus.OK); }
	  
	  }
	 

}
