package com.xworkz.java.collection.List.VectorList.Vector_dta_dao.FlightService;

import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DAO.FlightDAO;
import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DAO.FlightDAOImpl;
import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DTO.FlightDTO;

public class FlightServiceImpl implements FlightService {
	FlightDAO flightDAO =  new FlightDAOImpl();

	@Override
	public void addFlight(FlightDTO dto) {
		double price=dto.getPrice();
		if(price>25000) {
			flightDAO.addFlight(dto);
			System.out.println(dto);
		}
		else {
			System.out.println(" Ur Flight is missed");
		}
		
	}

	@Override
	public FlightDTO getFlight(double dto) {
		
		return flightDAO.getFlight(dto);
	}

	public void updateFlight(String type) {
		
	
		if( type=="National") {
			flightDAO.updateFlight(type);
			System.out.println(type);
		}
		else {
			System.out.println("Flight is Unavailable");
		}
	}

	@Override
	public void deleteFlight(FlightDTO dto) {
		flightDAO.deleteFlight(dto);
		
	}
	
	

}
