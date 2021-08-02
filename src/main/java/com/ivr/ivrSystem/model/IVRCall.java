package com.ivr.ivrSystem.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Component;
@Component
public class IVRCall {

	private String id;
	private String startTime;
	private IVROptions ivrOptions;
	private boolean isIvrActive;

	public String getId() {
		return id;
	}

	public IVRCall(String startTime,IVROptions ivrOptions,boolean isIvrActive) {
		this.id = UUID.randomUUID().toString();
		this.startTime=startTime;
		this.ivrOptions=ivrOptions;
		this.isIvrActive=isIvrActive;
	}

	public IVRCall() {
		
	}
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public IVROptions getIvrOptions() {
		return ivrOptions;
	}

	public void setIvrOptions(IVROptions ivrOptions) {
		this.ivrOptions = ivrOptions;
	}

	public boolean isIvrActive() {
		return isIvrActive;
	}

	public void setIvrActive(boolean isIvrActive) {
		this.isIvrActive = isIvrActive;
	}

}
