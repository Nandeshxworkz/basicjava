package com.xworkz.politician.constants;

public enum PartySymbol {
	
	BJPSYMBOL("LOTUS"),
	JDSSYMBOL("GROSS"),
	CONGESSSYMBOL("PALM"),
	AAPSYMBOL("BROOM"),
	TDPSYMBOL("CYCLE"),
	KJPSYMBOL("COCONUT"),
	PRKYSYMBOL("KITE"),
	PDPSYMBOL("PEN"),
	LDPSYMBOL("UMBRELLA");
	
	private String partySymbol;
	
   private	PartySymbol(String partySymbol) {
	   this.partySymbol=partySymbol;
   }
   
   public String getPartySymbol() {
	   return partySymbol;
   }
	
    public static PartySymbol getbyvalue(String value){
    	PartySymbol[] partySymbol = PartySymbol.values();
    	for(PartySymbol symbol1:partySymbol) {
    		if(symbol1.partySymbol.equals(value)) {
    			return symbol1;
    		}
    	}
    
		return null;
    	
    }
   
}
