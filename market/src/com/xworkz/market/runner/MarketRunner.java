package com.xworkz.market.runner;

import java.time.LocalDate;

import com.xworkz.market.entity.MarketEntity;
import com.xworkz.market.service.ServiceDAO;
import com.xworkz.market.service.ServiceDAOImpl;

public class MarketRunner {
	public static void main(String[] args) {
		
		MarketEntity entity = new MarketEntity();
		entity.setId(1);
		entity.setName("Dmart");
		entity.setLocation("Btm");
		entity.setNoofstall(20);
		entity.setMaxCapacity(15000);
		entity.setCreatedBy("shart");
		entity.setCreatedDate(LocalDate.now());
		entity.setUpdatedBy("bss");
		entity.setUpdatedDate(LocalDate.now());
		
		ServiceDAO dao = new ServiceDAOImpl();
		dao.validateAndSave(entity);
	}

}
