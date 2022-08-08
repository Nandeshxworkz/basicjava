package com.xworkz.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="resort_info")
public class ResortEntity {
	
	@Column(name="id")
	
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
