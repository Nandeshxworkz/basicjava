package com.xworkz.politician.dao;

import com.xworkz.policitian.dto.PoliticianDTO;

public interface PoliticianDAO {
	boolean save(PoliticianDTO politicianDTO);
	PoliticianDTO findById(int id);
	PoliticianDTO findByIdAndPresident(int id , String president);
	PoliticianDTO findByIdAndPresidentAndName(int id ,String president , String name);
	PoliticianDTO findByIdAndName(int id , String name);
	String findNamebyId(int id);
	String findPresidentByIdAndName(int id,String name);
	int getTotal();
     PoliticianDTO findPartyByMaxMembers();

}
