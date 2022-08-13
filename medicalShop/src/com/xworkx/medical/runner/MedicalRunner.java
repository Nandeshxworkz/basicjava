package com.xworkx.medical.runner;

import java.time.LocalDate;

import com.xworkz.medical.dao.MedicalDAO;
import com.xworkz.medical.dao.MedicalDAOImpl;
import com.xworkz.medicalShop.entity.MedicalShopEntity;

public class MedicalRunner {
	public static void main(String[] args) {
	
	MedicalShopEntity entity = new MedicalShopEntity();
	entity.setId(1);
	entity.setName("mayur");
	entity.setLocation("bengalore");
	entity.setCreatedBy("ravi");
	entity.setCreatedDate(LocalDate.of(2020, 9, 12));
	entity.setUpdatedBy("shambu");
	entity.setUpdatedDate(LocalDate.of(2021, 1, 10));
	entity.setPrice(2000D);
	entity.setOwner("moksha");
	
	MedicalDAO dao = new MedicalDAOImpl();
//   boolean saved =	dao.save(entity);
//   System.out.println("Data saved :"+ saved);

	MedicalShopEntity entity1 = dao.findById(1);
	System.out.println(entity1);

	//dao.updateNameAndLocationById("mannar", "bagalkot", 1);

	dao.deleteById(2);

}
}

