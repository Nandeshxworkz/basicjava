package com.xworkz.homestay.dao;

import com.xworkz.homestay.entity.HomeStayEntity;

public interface HomeStayDAO {
	
	boolean save(HomeStayEntity entity);
	
	HomeStayEntity findById(int id);
	
	void updateNameAndLocationById(String newName, String newLocation,int id);
	
	void deleteById(int id);


}
