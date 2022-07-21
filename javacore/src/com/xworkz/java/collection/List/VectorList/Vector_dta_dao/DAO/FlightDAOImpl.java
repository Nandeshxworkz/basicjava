package com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DAO;

import java.util.Vector;

import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DTO.FlightDTO;

public class FlightDAOImpl implements FlightDAO{
	Vector<FlightDTO> flights = new Vector<FlightDTO>();

	@Override
	public void addFlight(FlightDTO dto) {
	  flights.add(dto);
	  System.out.println("Added Flight Details :"+ dto);
		
	}

	@Override
	public FlightDTO getFlight(double price) {
		 for(int i=0; i<flights.size(); i++) {
			 if(flights.get(i).getPrice()==price) {
				 System.out.println("flight details :"+flights.get(i));
			  return flights.get(i);
			 }
		 }
		return null;
	}

	@Override
	public void updateFlight(String type) {
		
		for(int i = 0; i<flights.size();i++) {
			FlightDTO dto = new FlightDTO();
		if(flights.get(i).getType() == dto.getType()) {
		
		//	flights.get(i).setType(dto.getType());
			System.out.println("Updated type is:" + flights.get(i));
		}
	}
		
	}

	@Override
	public void deleteFlight(FlightDTO dto) {
		int count = 0;
		for (int i=0; i< flights.size(); i++) {
			if( flights.get(i) != null && flights.get(i).getType() == dto.getType()) {
				flights.remove(i);
					count++;
				}

			}	
		if(count > 0) {
			System.out.println("The Flight name is :" +dto.getType() +" " + dto.getType() + " being deleted from the VectorList" );
		}

		else {
			System.out.println("Invalid Input");
		}
		
	}

}
