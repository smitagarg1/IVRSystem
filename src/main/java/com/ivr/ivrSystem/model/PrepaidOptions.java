package com.ivr.ivrSystem.model;

	public enum PrepaidOptions {

		
		  ONE("New Prepad connection"),
		   TWO("Cuurent Bill"),
		    THREE("BROADBAND"),
		EIGHT("Go Back");

		    public final String connectionType;

		    

			private PrepaidOptions(String connectionType) {
		        this.connectionType = connectionType;
		    }
	
}
