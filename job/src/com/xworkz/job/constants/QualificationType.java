package com.xworkz.job.constants;

public enum QualificationType {
	BE("BE"),
	BTECH("BTech"),
	BCA("bca"),
	MTECH("MTech");
	
	private String name;
	
	private QualificationType(String name) {
		   this.name=name;
		}
		
		public String getQualification() {
			return name;

}
}
