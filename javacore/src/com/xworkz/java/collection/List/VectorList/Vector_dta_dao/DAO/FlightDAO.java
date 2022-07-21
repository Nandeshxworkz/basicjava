package com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DAO;

import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DTO.FlightDTO;

public interface FlightDAO {
	    void addFlight(FlightDTO dto);
	    FlightDTO getFlight(double price);
	    void updateFlight(String type);
	    void deleteFlight(FlightDTO dto);

}
