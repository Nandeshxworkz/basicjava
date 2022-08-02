package com.xworkz.bar.runner;

import com.xworkz.bar.constant.BarType;
import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;

public class BarRunner {
	public static void main(String[] args) {
		BarDTO barDTO = new BarDTO(8,"","Majestic",BarType.WINE,15000D,15000*30D);
		
		BarDAO barDAO = new BarDAOImpl();
		barDAO.save(barDTO);
		
	}

}
