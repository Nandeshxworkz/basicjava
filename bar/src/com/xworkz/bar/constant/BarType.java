package com.xworkz.bar.constant;

public enum BarType {
	
	WINE("wine"),
	MSIL("msil"),
	BAR_RESTURANT("bar and resturent"),
	RESORT("resort"),
	DEFAULT("resturent");
	
	private String name; 
	
	private BarType(String name) {
	   this.name=name;
	}
	
	public String getBar() {
		return name;
				
	}

}
