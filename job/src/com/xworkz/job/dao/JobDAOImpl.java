package com.xworkz.job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.job.constants.DBProperties.*;

import com.xworkz.job.constants.DesignationType;
import com.xworkz.job.constants.QualificationType;
import com.xworkz.job.dto.JobDTO;

public class JobDAOImpl implements JobDAO{

	@Override
	public boolean save(JobDTO jobDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(), SECRET.getValue());
			String insert = "insert into job.job_info values(?,?,?,?,?,?)";
			System.out.println(insert);
			PreparedStatement statement = connection.prepareStatement(insert);
			statement.setInt(1, jobDTO.getId());
			statement.setString(2,jobDTO.getType().getType());
			statement.setDouble(3, jobDTO.getPackages());
			statement.setString(4,jobDTO.getName().getQualification());
			statement.setDouble(5, jobDTO.getPercentage());
			statement.setString(6, jobDTO.getFresher());
			
			int rowsAffected = statement.executeUpdate();
			if(rowsAffected>0) {
				System.out.println("data saved :"+ rowsAffected);
				return true;
			}else {
				System.out.println("data not saved");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public JobDTO findById(Integer id) {
		
		try {
			Connection	connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(), SECRET.getValue());
			String search = "select * from job.job_info where id=?";
			
			PreparedStatement statement = connection.prepareStatement(search);
			statement.setInt(1, id);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()) {
				Integer id1 = resultset.getInt(1);
				String dstn = resultset.getString(2);
				Double lpa = resultset.getDouble(3);
				String qual = resultset.getString(4);
				Double perctage = resultset.getDouble(5);
				String fresh = resultset.getString(6);
				
				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(id1);
				jobDTO.setType(DesignationType.valueOf(dstn));
				jobDTO.setPackages(lpa);
				jobDTO.setName(QualificationType.valueOf(qual));
				jobDTO.setPercentage(perctage);
				jobDTO.setFresher(fresh);
				return jobDTO;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignation(Integer id, String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDTO findByIdAndDesigantionAndQualification(Integer id, String desigantion, String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String isFresherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getmaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}



}
