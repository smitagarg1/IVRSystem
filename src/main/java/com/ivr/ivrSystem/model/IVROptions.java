package com.ivr.ivrSystem.model;

public enum IVROptions {

	
	  ONE("PostPaid"),
	   TWO("PREPAID"),
	    THREE("BROADBAND"),
	    EIGHT("Go Back");

	    public final String connectionType;

	    

		private IVROptions(String connectionType) {
	        this.connectionType = connectionType;
	    }
	
		
		
}
