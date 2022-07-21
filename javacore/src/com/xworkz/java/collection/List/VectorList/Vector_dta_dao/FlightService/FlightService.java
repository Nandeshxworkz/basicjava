package com.xworkz.java.collection.List.VectorList.Vector_dta_dao.FlightService;

import com.xworkz.java.collection.List.VectorList.Vector_dta_dao.DTO.FlightDTO;

public interface FlightService {
    void addFlight(FlightDTO dto);
    FlightDTO getFlight(double price);
    void updateFlight(String type);
    void deleteFlight(FlightDTO dto);
}
