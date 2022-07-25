package com.xworkz.java.collection.Set.HashSet.Service;

import com.xworkz.java.collection.Set.HashSet.DAO.TrainDAO;
import com.xworkz.java.collection.Set.HashSet.DAO.TrainDAOImpl;
import com.xworkz.java.collection.Set.HashSet.TrainDTO.TrainDTO;

public class TrainServiceImpl implements TrainService {
	
	TrainDAO trainDAO = new TrainDAOImpl();


	@Override
	public void addTrain(TrainDTO dto) {
		
	Integer number	=dto.getNumber();
		if(number!=0) {
			trainDAO.addTrain(dto);
			//System.out.println(dto);
		}
		else {
			System.out.println(" Train number is invalid");
		}
		
	}

	@Override
	public TrainDTO getTrain(int number) {
		return trainDAO.getTrain(number);
	}

	@Override
	public void updateTrain(TrainDTO dto) {
		Integer number =dto.getNumber();
		if(number!=0) {
			trainDAO.updateTrain(dto);
		}
		else {
			System.out.println("Train number is invalid");
		}
		
	}

	@Override
	public void deleteTrain(TrainDTO dto) {
		trainDAO.deleteTrain(dto);
		
	}}
