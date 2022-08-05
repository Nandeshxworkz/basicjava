package com.xworkz.politician.constants;

public enum DBProperties {
	
	URL("jdbc:mysql://localhost:3306/policitian"),
	USERNAME("root"),
	SECRET("Nandesh@1234");
	
	private String value;
	
	
private DBProperties (String value) {
	this.value=value;
}

public String getValue() {
	return value;
}

}
