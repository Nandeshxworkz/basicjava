package com.xworkz.market.util;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

public class Factory {
	
   private static ValidatorFactory factory;
   
   public static ValidatorFactory getFactory() {
	return factory;
}
   static {
	   factory=Validation.buildDefaultValidatorFactory();
   }

}
