package com.xworkz.bar.dto;

import java.io.Serializable;

import com.xworkz.bar.constant.BarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor



public class BarDTO implements Serializable{
	
	private Integer id;
	private String name;
	private String location;
	private BarType type = BarType.DEFAULT;
	private Double avgCollectionperDay;
	private Double avgCollectionperMonth;

	
	
	
}
