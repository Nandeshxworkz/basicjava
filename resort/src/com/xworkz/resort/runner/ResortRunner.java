package com.xworkz.resort.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		
		ResortEntity resortEntity = new ResortEntity();
		resortEntity.setId(3);
		resortEntity.setName("mango mist");
		resortEntity.setLocation("kanakpur road");
		resortEntity.setOwner("nandish");
		resortEntity.setChechInTime(LocalTime.of(11, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setCreateBy("om");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setPricePerDay(2000D);
		
		ResortDAO dao = new ResortDAOImpl();
		boolean saved =dao.save(resortEntity);
		System.out.println("saved :"+saved);

	}

}
