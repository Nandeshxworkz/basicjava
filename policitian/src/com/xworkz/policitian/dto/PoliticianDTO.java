package com.xworkz.policitian.dto;

import com.xworkz.politician.constants.PartyName;
import com.xworkz.politician.constants.PartySymbol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PoliticianDTO {
	private int id;
	private PartyName partyName = PartyName.AAP;
	private String president;
	private double totalMembers;
	private PartySymbol partySymbol = PartySymbol.BJPSYMBOL;
	private String partyColor;
	private String partyLocation;
	private String partyState;
	private double budget;

	
}
