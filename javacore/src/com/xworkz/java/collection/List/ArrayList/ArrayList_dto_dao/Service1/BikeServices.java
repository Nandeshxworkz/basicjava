package com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Service1;

import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.dto1.BikeDTO;

public interface BikeServices {
	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);

}
