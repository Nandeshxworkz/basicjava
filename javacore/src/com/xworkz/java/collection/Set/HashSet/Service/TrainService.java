package com.xworkz.java.collection.Set.HashSet.Service;

import com.xworkz.java.collection.Set.HashSet.TrainDTO.TrainDTO;

public interface TrainService {
	void addTrain(TrainDTO dto);
	TrainDTO getTrain(int number);
	void updateTrain(TrainDTO dto);
	void deleteTrain(TrainDTO dto);
	
}
