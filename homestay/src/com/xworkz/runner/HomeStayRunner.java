package com.xworkz.runner;

import java.time.LocalDate;

import com.xworkz.homestay.dao.HomeStayDAO;
import com.xworkz.homestay.dao.HomeStayDAOImpl;
import com.xworkz.homestay.entity.HomeStayEntity;


public class HomeStayRunner {
	public static void main(String[] args) {
		
		
		HomeStayEntity entity = new HomeStayEntity();
		entity.setId(2);
		entity.setName("durga");
		entity.setLocation("Hyderbad");
		entity.setCreatedBy("sandeep");
		entity.setCreatedDate(LocalDate.of(2010, 3, 02));
		entity.setUpdatedBy("suresh");
		entity.setUpdatedDate(LocalDate.of(2022, 1, 20));
		entity.setPrice(2000D);
		entity.setOwner("moksha");
		
		HomeStayDAO dao = new HomeStayDAOImpl();
//	   boolean saved =	dao.save(entity);
//	   System.out.println("Data saved :"+ saved);

		HomeStayEntity entity1 = dao.findById(1);
		System.out.println(entity1);

		dao.updateNameAndLocationById("malvan stay", "maharashtra", 1);

		dao.deleteById(2);
	}

}
