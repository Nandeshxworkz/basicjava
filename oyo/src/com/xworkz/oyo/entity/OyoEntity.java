package com.xworkz.oyo.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="oyo_info")
public class OyoEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Location")
	private String location;
	@Column(name="Owner")
	private String owner;
	@Column(name="PricePerDay")
	private double pricePerDay;
	@Column(name="CheckInTime")
	private LocalTime checkInTime;
	@Column(name="CheckOutTime")
	private LocalTime checkOutTime;
	@Column(name="CreatedBy")
	private String createdBy;
	@Column(name="UpdatedBy")
	private String updatedBy;
	
	

}
