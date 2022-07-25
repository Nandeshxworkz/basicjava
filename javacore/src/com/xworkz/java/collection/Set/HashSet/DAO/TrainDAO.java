package com.xworkz.java.collection.Set.HashSet.DAO;

import com.xworkz.java.collection.Set.HashSet.TrainDTO.TrainDTO;

public interface TrainDAO {
	void addTrain(TrainDTO dto);
	TrainDTO getTrain(int number);
	void updateTrain(TrainDTO dto);
	void deleteTrain(TrainDTO dto);

}
