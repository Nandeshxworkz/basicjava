package com.xworkz.bank.dao;

import com.xworkz.bank.entity.BankEntity;

public interface BankDAO {

	boolean save(BankEntity entity);
	
	BankEntity findById(int id);
	
	void updateNameAndLocationById(String newName, String newLocation,int id);
	
	void deleteById(int id);
}
