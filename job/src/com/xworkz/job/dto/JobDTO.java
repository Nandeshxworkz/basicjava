package com.xworkz.job.dto;

import com.xworkz.job.constants.DesignationType;
import com.xworkz.job.constants.QualificationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JobDTO {
	
	private Integer id;
	private DesignationType type = DesignationType.TRAINEE;
	private Double packages;
	private QualificationType name =QualificationType.BE;
	private Double percentage;
	private String fresher;

}
