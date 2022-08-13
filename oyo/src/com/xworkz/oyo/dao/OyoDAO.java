package com.xworkz.oyo.dao;

import com.xworkz.oyo.entity.OyoEntity;

public interface OyoDAO {
	boolean save(OyoEntity entity);
	
	OyoEntity findById(int id);
	
	void updateNameAndLocationById(String newName, String newLocation,int id);
	
	void deleteById(int id);

}
