package com.xworkz.bar.constant;

public enum MysqlProperties {
	URL("jdbc:mysql://localhost:3306/bar"),USERNAME("root"),SECRET("Nandesh@1234");
	
	private String value;
	
	private MysqlProperties(String value) {
		this.value=value;	
	}
	
	public String getValue() {
		return value;
	}

}
