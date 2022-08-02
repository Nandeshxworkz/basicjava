package com.xworkz.job.dao;

import com.xworkz.job.dto.JobDTO;

public interface JobDAO {
	
	boolean save(JobDTO jobDTO);
	JobDTO findById(Integer id);
	JobDTO findByIdAndDesignation(Integer id,String designation);
    JobDTO findByIdAndDesigantionAndQualification(Integer id,String desigantion,String qualification);
    int getTotal();
    String isFresherById(Integer id);
    Double getmaxPercentage();
}
