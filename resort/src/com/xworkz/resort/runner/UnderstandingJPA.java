package com.xworkz.resort.runner;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class UnderstandingJPA {

	public static void main(String[] args) {
    
		ResortDAO dao = new ResortDAOImpl();
	ResortEntity entity1 =dao.findByID(1);
		System.out.println(entity1);

   // ResortEntity entity = new ResortEntity();
    		
	dao.updateOwnerAndLocationById("varshini", "mudhol", 1);
	
	dao.deleteById(2);
	}

}
