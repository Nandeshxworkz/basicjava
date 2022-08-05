package com.xworkz.politician.constants;

public enum PartyName {
	
	BJP("BJP"),JDS("JDS"),CONGRESS("CONGRESS"),AAP("Aam Aadmi party"),TDP("telugu desh party"),
	KJP("KJP"),PRKY("PRKY"),PDP("PDP"),LDP("LDP");
	
	private String partyName;
	
	
	private PartyName(String partyName) {
		this.partyName=partyName;
	}
	
	public String getPartyName() {
		return partyName;
		}

	public static PartyName getValueBy(String value) {
		PartyName[] partyName = PartyName.values();
		for(PartyName partyname2:partyName) {
			if(partyname2.partyName.equals(value)) {
				return partyname2;
			}
		}
		return null;
		}
}
