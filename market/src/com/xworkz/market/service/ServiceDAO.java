package com.xworkz.market.service;

import com.xworkz.market.entity.MarketEntity;

public interface ServiceDAO {
	boolean validateAndSave(MarketEntity entity);

}
