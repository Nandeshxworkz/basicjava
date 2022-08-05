package com.xworkz.politician.runner;

import java.util.List;

import com.xworkz.policitian.dto.PoliticianDTO;
import com.xworkz.politician.constants.PartyName;
import com.xworkz.politician.constants.PartySymbol;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;

public class PoliticianRunner {
	public static void main(String[] args) {
		
		
		PoliticianDTO pdto = new PoliticianDTO(10,PartyName.BJP,"Nandesh",543.0D,PartySymbol.AAPSYMBOL,"Orange","mudhol","mudhol",90000000.00D);

		PoliticianDAO pdao = new PoliticianDAOImpl();
		
		//pdao.save(pdto);
		
		
	PoliticianDTO pdto1=pdao.findById(1);
	System.out.println("findById :"+pdto1);
	
	PoliticianDTO pdto2 = pdao.findByIdAndPresident(3,"hdk");
	System.out.println("findByIdAndPresident :"+pdto2);
	
	System.out.println(" ------------------------");
	PoliticianDTO pdto3 = pdao.findByIdAndPresidentAndName(10,"Nandesh","BJP");
	System.out.println("findByIdAndPresidentAndName :"+pdto3);
	
	System.out.println("_____________________________");
	PoliticianDTO pdto4 = pdao.findByIdAndName(5, "KJP"); 
	System.out.println("findByIdAndName :"+pdto4);
	
	System.out.println("____________________________");
	String pdto5 = pdao.findNamebyId(10);
	System.out.println("findNamebyId :"+pdto5);
	
	System.out.println("---------------------------");
	String pdto6 = pdao.findPresidentByIdAndName(2, "BJP");
	System.out.println(pdto6);
	
	System.out.println("Get total ");
	int pdto7 = pdao.getTotal();
	System.out.println(pdto7);
	
	System.out.println(" ^^^^^^^^^^^^^");
	String pdto8 =pdao.findPartyByMaxMembers();
	System.out.println("findPartyByMaxMembers:"+pdto8);
		
	
	List<PoliticianDTO> pdto9 = pdao.findAll();
	System.out.println(pdto9);
		
		List<String> ls = pdao.findAllPartyName();
		System.out.println(ls);
		
		List<Integer> li = pdao.findAllIds();
		System.out.println(li);
	
		List<Object> lo = pdao.findAllTotalMembersAndPartyBudgetAndPartyName();
	    System.out.println(lo);
	}

}
