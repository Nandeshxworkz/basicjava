package com.xworkz.pub.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Table(name="pub_info")
@Entity

public class PubEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Location")
	private String location;
	@Column(name="CreatedBy")
	private String createdBy;
	@Column(name="CreatedDate")
	private LocalDate createdDate;
	@Column(name="UpdatedBy")
	private String updatedBy;
	@Column(name="UpdatedDate")
	private LocalDate updatedDate;
	@Column(name="PricePerDay")
	private double pricePerDay;
	@Column(name="Owner")
	private String owner;


}
