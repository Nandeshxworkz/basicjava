package com.xworkz.resort.dao;

import com.xworkz.resort.entity.ResortEntity;

public interface ResortDAO {
	boolean save(ResortEntity entity);
	
	ResortEntity findByID(int id);
	
	void updateOwnerAndLocationById(String newOwner, String newLocation,int id);
	
	void deleteById(int id);

}
