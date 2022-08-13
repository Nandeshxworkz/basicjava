package com.xworkz.bank.runner;

import java.time.LocalTime;

import com.xworkz.bank.dao.BankDAO;
import com.xworkz.bank.dao.BankDAOImpl;
import com.xworkz.bank.entity.BankEntity;



public class BankRunner {

	public static void main(String[] args) {
    
		BankEntity entity = new BankEntity();
		entity.setId(2);
		entity.setName("union bank");
		entity.setLocation("sameervadi");
		entity.setOwner("nandesh");
		entity.setPrice(100000D);
		entity.setCheckInTime(LocalTime.now());
		entity.setCheckOutTime(LocalTime.now());
		entity.setCreatedBy("ram");
	    entity.setUpdatedBy("allok");
		
		
		
		BankDAO dao = new BankDAOImpl();
//	   boolean saved =	dao.save(entity);
//       System.out.println("Data saved :"+ saved);

		BankEntity entity1 = dao.findById(1);
		System.out.println(entity1);

		dao.updateNameAndLocationById("Statebank", "jkd", 1);

		dao.deleteById(2);

	}

}
