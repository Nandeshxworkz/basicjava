package com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Service1;

import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Dao.BikeDAO;
import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Dao.BikeDAOImpl;
import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.dto1.BikeDTO;

public class BikeservicesImpl implements BikeServices {
	
	BikeDAO bikeDAO = new BikeDAOImpl();

	@Override
	public void addBike(BikeDTO dto) {
		// bikeDAO.addBike(dto);
	 double price = dto.getPrice();
	 if(price>200000) {
      bikeDAO.addBike(dto);
      System.out.println(dto);
	 }
	 else {
		 System.out.println("unavailable");
	 }
		
	}

	@Override
	public BikeDTO getBike(String dto) {
		return bikeDAO.getBike(dto);
	}

	@Override
	public void updateBike(BikeDTO dto) {
		String color = dto.getColor();
		if(color!="orange") {
			bikeDAO.updateBike(dto);
			System.out.println(dto);
		}
		else {
			System.out.println("color is Unavailable");
		}
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		
		
	}

}
