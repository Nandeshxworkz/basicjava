package com.xworkz.market.dao;

import com.xworkz.market.entity.MarketEntity;

public interface MarketDAO {

	boolean validateAndSave(MarketEntity entity);
}
