package com.xworkz.job.runner;

import com.xworkz.job.constants.DesignationType;
import com.xworkz.job.constants.QualificationType;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class JobRunner {
	public static void main(String[] args) {
		JobDTO jobDTO = new JobDTO(4,DesignationType.FULL_STACK_ENGINEER,500000.00D,QualificationType.BTECH,45.00D,"Yes");
		
		JobDAO jobDAO = new JobDAOImpl();
	   // jobDAO.save(jobDTO);
		
	JobDTO	jobdto =jobDAO.findById(2);
	System.out.println(jobdto);
	
	JobDTO jobdto1=jobDAO.findByIdAndDesignation(1, "se");
	System.out.println(jobdto1);
	
	JobDTO jobdto2= jobDAO.findByIdAndDesigantionAndQualification(3, "ase", "MTech");
	System.out.println(jobdto2);
	
	         jobDAO.getTotal();
	         
	         System.out.println("---------------------");
	  String dto4  = jobDAO.isFresherById(4);    
	        System.out.println(" fresher :"+dto4);
	        
	        System.out.println("--------");
	       Double bs=jobDAO.getmaxPercentage();
	       System.out.println(bs);  
		
	}

}
