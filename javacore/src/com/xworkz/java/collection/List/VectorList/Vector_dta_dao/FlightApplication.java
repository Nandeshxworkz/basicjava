package com.xworkz.java.collection.List.VectorList.Vector_dta_dao;

import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DTO.FlightDTO;
import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.FlightService.FlightService;
import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.FlightService.FlightServiceImpl;

public class FlightApplication {
	public static void main(String[] args) {
		
		FlightDTO flight = new FlightDTO();
		flight.setDestination("Switzerland");
		flight.setName("Airlines");
		flight.setPrice(50000);
		flight.setSource("India");
		flight.setType("International jet");
		
		FlightDTO flight1 = new FlightDTO();
		flight1.setDestination("Chennai");
		flight1.setName("Deccan");
		flight1.setPrice(100000);
		flight1.setSource("Bangalore");
		flight1.setType("National jet");
		
		FlightService service = new FlightServiceImpl();
		service.addFlight(flight);
		service.addFlight(flight1);
		
		service.getFlight(50000);
		
        // flight1.setType("National");
		 service.updateFlight("National");
		
		
		
		service.deleteFlight(flight);
		
	}

}
