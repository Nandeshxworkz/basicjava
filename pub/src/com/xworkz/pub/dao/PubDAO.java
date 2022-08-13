package com.xworkz.pub.dao;

import com.xworkz.pub.Entity.PubEntity;

public interface PubDAO {
	boolean save(PubEntity entity);
	
	PubEntity findById(int id);
	
	void updateNameAndLocationById(String newName, String newLocation,int id);
	
	void deleteById(int id);

}
