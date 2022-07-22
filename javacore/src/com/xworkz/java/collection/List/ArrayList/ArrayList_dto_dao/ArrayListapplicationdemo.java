package com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao;

import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Service1.BikeServices;
import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.Service1.BikeservicesImpl;
import com.xworkz.java.collection.List.ArrayList.ArrayList_dto_dao.dto1.BikeDTO;

public class ArrayListapplicationdemo {
	public static void main(String[] args) {
		
		BikeDTO duke = new BikeDTO();
		duke.setModelNo(15685);
		duke.setCompanyName("Bajaj");
		duke.setCubicCapacity("390cc");
		duke.setColor("white");
		duke.setPrice(280000.00);
		duke.setTopSpeed(200);
		
		BikeDTO ninja = new BikeDTO();
		ninja.setModelNo(15675);
		ninja.setCompanyName("Ninja Bajaj");
		ninja.setCubicCapacity("1000cc");
		ninja.setColor("Green");
		ninja.setPrice(2100000.00);
		ninja.setTopSpeed(400);
		
		BikeDTO NS200 = new BikeDTO();
		NS200.setModelNo(15677);
		NS200.setCompanyName("pulser");
		NS200.setCubicCapacity("200cc");
		NS200.setColor("White-Black");
		NS200.setPrice(144000);
		NS200.setTopSpeed(125);
		
		BikeDTO fZ = new BikeDTO();
		fZ.setModelNo(156525);
		fZ.setCompanyName("Yamaha");
		fZ.setCubicCapacity("149cc");
		fZ.setColor("Blue");
		fZ.setPrice(141000.00);
		fZ.setTopSpeed(125);
		
		BikeDTO gixxer = new BikeDTO();
		gixxer.setModelNo(156775);
		gixxer.setCompanyName("Suzuki");
		gixxer.setCubicCapacity("155cc");
		gixxer.setColor("Black");
		gixxer.setPrice(169000.00);
		gixxer.setTopSpeed(134);
		
		BikeServices service = new BikeservicesImpl();
		service.addBike(duke);
		service.addBike(ninja);
		service.addBike(NS200);
		service.addBike(fZ);
		service.addBike(gixxer);
		
		System.out.println("");
		
		service.getBike("Yamaha");
		
		System.out.println("");
		
		gixxer.setColor("brown");
		service.updateBike(gixxer);
		
		System.out.println("");
		
		service.deleteBike(fZ);
	}
	}


