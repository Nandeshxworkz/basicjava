package com.xworkz.medical.dao;

import com.xworkz.medicalShop.entity.MedicalShopEntity;

public interface MedicalDAO {
	boolean save(MedicalShopEntity entity);
	
	MedicalShopEntity findById(int id);
	
	void updateNameAndLocationById(String newName, String newLocation,int id);
	
	void deleteById(int id);

}
