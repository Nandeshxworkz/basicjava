package com.xworkz.cartoon.dao;

import java.time.LocalDate;
import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public interface CartoonDAO {
	
	boolean save(List<CartoonEntity> entity);
	
	CartoonEntity findByName(String name);
	
	Integer total();
	
	CartoonEntity findByMaxCreatedDate();
	
	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country,String gender,String author);
 
	String findAuthorByName(String name);
	
	Object[] findNameAndCountryByAuthor(String author);
	
	LocalDate findCreatedDateByAuthor(String author);
	
	void updateAuthorByName(String newAuthor,String name);
	
	void updateTypeByName(String newType,String name);
	
	void deleteByName(String name);
}
