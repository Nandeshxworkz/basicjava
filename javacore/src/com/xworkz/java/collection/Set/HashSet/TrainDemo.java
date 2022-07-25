package com.xworkz.java.collection.Set.HashSet;

import java.util.HashSet;

import com.xworkz.java.collection.Set.HashSet.Service.TrainService;
import com.xworkz.java.collection.Set.HashSet.Service.TrainServiceImpl;
import com.xworkz.java.collection.Set.HashSet.TrainDTO.TrainDTO;

public class TrainDemo {
	public static void main(String[] args) {
		
		TrainDTO channamma = new TrainDTO();
		channamma.setDestination("dharawad");
		channamma.setName("Rani channamma");
		channamma.setNoOfCompartments(20);
		channamma.setNumber(17456);
		channamma.setPrice(350.00);
		channamma.setSource("bangalore");
		
		TrainDTO Shatabdi = new TrainDTO();
		Shatabdi.setDestination("Mysore");
		Shatabdi.setName("Shatabdi");
		Shatabdi.setNoOfCompartments(40);
		Shatabdi.setNumber(17444);
		Shatabdi.setPrice(100.0);
		Shatabdi.setSource("bangalore");
		
//		HashSet hs = new HashSet();
//		hs.add(Shatabdi);
//		hs.add(channamma);
//		
//		System.out.println(hs);
		
		TrainService service = new TrainServiceImpl();
		service.addTrain(Shatabdi);
		service.addTrain(channamma);
		
		
	    TrainDTO traindto = service.getTrain(17444);
		System.out.println("The getting Train number details is : "+traindto);
		
		Shatabdi.setName("Shatabdi express");
		service.updateTrain(Shatabdi);
		
		service.deleteTrain(channamma);
		
	}

}
