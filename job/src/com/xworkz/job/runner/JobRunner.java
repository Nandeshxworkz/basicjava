package com.xworkz.job.runner;

import com.xworkz.job.constants.DesignationType;
import com.xworkz.job.constants.QualificationType;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class JobRunner {
	public static void main(String[] args) {
		JobDTO jobDTO = new JobDTO(2,DesignationType.TRAINEE,250000.00D,QualificationType.BCA,85.00D,"NO");
		
		JobDAO jobDAO = new JobDAOImpl();
		//jobDAO.save(jobDTO);
		
		jobDAO.findById(1);
		
	}

}
