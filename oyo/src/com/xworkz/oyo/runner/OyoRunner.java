package com.xworkz.oyo.runner;

import java.time.LocalTime;

import com.xworkz.oyo.dao.OyoDAO;
import com.xworkz.oyo.dao.OyoDAOImpl;
import com.xworkz.oyo.entity.OyoEntity;



public class OyoRunner {

	public static void main(String[] args) {
		
		OyoEntity entity = new OyoEntity();
		entity.setId(2);
		entity.setName("saraswati");
		entity.setLocation("bengalore");
		entity.setOwner("babu");
		entity.setPricePerDay(2000D);
		entity.setCheckInTime(LocalTime.now());
		entity.setCheckOutTime(LocalTime.now());
		entity.setCreatedBy("ram");
		entity.setUpdatedBy("manager");
		
		
		
		OyoDAO dao = new OyoDAOImpl();
//	   boolean saved =	dao.save(entity);
//       System.out.println("Data saved :"+ saved);

		OyoEntity entity1 = dao.findById(1);
		System.out.println(entity1);

		dao.updateNameAndLocationById("Nandi", "jkd", 1);

		dao.deleteById(2);

	}

}
