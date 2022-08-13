package com.xworkz.pub;

import java.time.LocalDate;

import com.xworkz.pub.Entity.PubEntity;
import com.xworkz.pub.dao.PubDAO;
import com.xworkz.pub.dao.PubDAOImpl;

public class PubRunner {

	public static void main(String[] args) {

//		PubEntity entity = new PubEntity();
//		entity.setId(2);
//		entity.setName("sharat");
//		entity.setLocation("bengalore");
//		entity.setCreatedBy("shadow");
//		entity.setCreatedDate(LocalDate.of(2019, 9, 12));
//		entity.setUpdatedBy("manager");
//		entity.setUpdatedDate(LocalDate.of(2021, 1, 10));
//		entity.setPricePerDay(2000D);
//		entity.setOwner("Nandesh");
//		
		PubDAO dao = new PubDAOImpl();
//	   boolean saved =	dao.save(entity);
//       System.out.println("Data saved :"+ saved);

		PubEntity entity1 = dao.findById(1);
		System.out.println(entity1);

		dao.updateNameAndLocationById("samarth", "mahalingpur", 1);

		dao.deleteById(2);

	}

}
