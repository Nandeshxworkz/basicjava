package com.xworkz.market.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.market.dao.MarketDAO;
import com.xworkz.market.dao.MarketDAOImpl;
import com.xworkz.market.entity.MarketEntity;
import static com.xworkz.market.util.Factory.*;

public class ServiceDAOImpl implements ServiceDAO {

	MarketDAO dao = new MarketDAOImpl();
	ValidatorFactory factory = getFactory();
	

	@Override
	public boolean validateAndSave(MarketEntity entity) {
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MarketEntity>> cv = validator.validate(entity);
		if(cv.size()>0) {
			System.out.println("invalid details");

		}else {
			System.out.println("valid details");
			dao.validateAndSave(entity);
		}
		return false;
	}

}
