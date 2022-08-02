package com.xworkz.job.constants;

public enum DesignationType {
	
	SOFTWARE_ENGINEER("se"),
	ASSOCIATE_SE("ase"),
	FULL_STACK_ENGINEER("full stack"),
	TRAINEE("trainee");
	
private String type;
	
	private DesignationType(String type) {
		   this.type=type;
		}
		
	public String getType() {
		return type;
	}
	
}

