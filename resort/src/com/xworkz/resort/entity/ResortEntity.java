package com.xworkz.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data

public class ResortEntity {
	
	private int id;
	private String name;
	private String location;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private String createBy;
	private LocalDate createDate;
	private LocalDate updateDate;
	private String owner;
	private double pricePerDay;
	

}
