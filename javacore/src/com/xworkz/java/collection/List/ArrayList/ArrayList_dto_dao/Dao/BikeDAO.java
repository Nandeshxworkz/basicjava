package com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Dao;

import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.dto1.BikeDTO;

public interface BikeDAO {
	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);

}
