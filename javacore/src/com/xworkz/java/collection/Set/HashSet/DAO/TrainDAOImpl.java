package com.xworkz.java.collection.Set.HashSet.DAO;

import java.util.HashSet;

import com.xworkz.java.collection.Set.HashSet.TrainDTO.TrainDTO;



public class TrainDAOImpl implements TrainDAO {
	HashSet<TrainDTO> hashset = new HashSet<TrainDTO>();
	
	
	@Override
	public void addTrain(TrainDTO dto) {
		hashset.add(dto);
		System.out.println(dto);
		
	}
	
	@Override
	public TrainDTO getTrain(int number) {
		Object[] trains = hashset.toArray();
		Integer count=0;
		//int i;
		for(int i=0; i<trains.length; i++) {
		//	System.out.println(trains.length);
			TrainDTO train = (TrainDTO)trains[i];
	
			if(trains[i]!=null && train.getNumber()== number) {
				count++;
			}
		}	
			if(count != 0) {
				return (TrainDTO)trains[count];
			}
			else {
				return null;
			}	
	}
	
	
	@Override
	public void updateTrain(TrainDTO dto) {
		Object[] trains = hashset.toArray();
         int count=0;
		for(int i = 0; i < trains.length; i++) {
			TrainDTO train = (TrainDTO) trains[i];
			if(trains[i]!=null&& train.getName().equals(dto.getName())) {
				count++;
				train.setName(dto.getName());
				
				System.out.println("The  Train Details updated: " + trains[i]);
			}			
		}
		if (count == 0) {
			System.out.println(" Train Details not found");
		}
	}

	@Override
	public void deleteTrain(TrainDTO dto) {
		hashset.remove(dto);
		System.out.println("The train ticket had been cancelled :"+ dto);
		
		
	}




}
