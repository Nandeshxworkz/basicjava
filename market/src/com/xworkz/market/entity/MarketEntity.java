package com.xworkz.market.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@AllArgsConstructor
@Table(name="marketentity")
@Entity

public class MarketEntity extends ParentEntity {
	
    @Id
    @Min(value=1,message = "id is greaterthan zero")
	private int id;
    @NotNull
	private String name;
    @NotNull
	private String location;
    @Min(value=10)
    @Max(value=100)
	private int noofstall;
    @Min(value=1000)
    @Max(value=20000)
	private int maxCapacity;
	public MarketEntity( String name, String location, int noOfStall, int maxCapacity,String createdBy,LocalDate createdDate,String updatedBy,LocalDate updatedDate) {
		super(createdBy,createdDate,updatedBy,updatedDate);
	
		this.name = name;
		this.location = location;
		this.noofstall = noOfStall;
		this.maxCapacity = maxCapacity;
	}
	
	

}
