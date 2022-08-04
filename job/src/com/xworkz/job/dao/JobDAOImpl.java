package com.xworkz.job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

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
				System.out.println(id1+" "+dstn+" "+ lpa+" "+qual+" "+perctage+" "+fresh);
				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(id1);
				jobDTO.setType(DesignationType.getValueBy(dstn));
				jobDTO.setPackages(lpa);
				jobDTO.setName(QualificationType.getByValue(qual));
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
           try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
	        String search1 = "select * from job.job_info where id=? and Designation=? ";
	      //  System.out.println("search1 :"+ search1)
			
			PreparedStatement statement = connection.prepareStatement(search1);
			statement.setInt(1, id);
			statement.setString(2, designation);
			
			ResultSet resultset = statement.executeQuery(); 
			//System.out.println("resultSet check :"+ resultset);
	
			while(resultset.next()){
				Integer id1 = resultset.getInt(1);
				String dstn = resultset.getString(2);
				Double lpa = resultset.getDouble(3);
				String qual = resultset.getString(4);
				Double perctage = resultset.getDouble(5);
				String fresh = resultset.getString(6); 
				//System.out.println(" 2nd time get :"+id+" "+dstn+" "+ lpa+" "+qual+" "+perctage+" "+fresh);
				JobDTO jobDTO = new JobDTO();
				jobDTO.setId(id1);
				jobDTO.setType(DesignationType.getValueBy(dstn));
				jobDTO.setPackages(lpa);
				jobDTO.setName(QualificationType.getByValue(qual));
				jobDTO.setPercentage(perctage);
				jobDTO.setFresher(fresh);
				return jobDTO;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public JobDTO findByIdAndDesigantionAndQualification(Integer id, String designation, String qualification) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			 String search1 = "select * from job.job_info where id=? and Designation=? and Qualification=?";
		      //  System.out.println("search1 :"+ search1)
				
				PreparedStatement statement = connection.prepareStatement(search1);
				statement.setInt(1, id);
				statement.setString(2, designation);
				statement.setString(3, qualification);
				ResultSet resultset = statement.executeQuery(); 
				//System.out.println("resultSet check :"+ resultset);
		
				while(resultset.next()){
					Integer id1 = resultset.getInt(1);
					String dstn = resultset.getString(2);
					Double lpa = resultset.getDouble(3);
					String qual = resultset.getString(4);
					Double perctage = resultset.getDouble(5);
					String fresh = resultset.getString(6); 
					//System.out.println(" 2nd time get :"+id+" "+dstn+" "+ lpa+" "+qual+" "+perctage+" "+fresh);
					JobDTO jobDTO = new JobDTO();
					jobDTO.setId(id1);
					jobDTO.setType(DesignationType.getValueBy(dstn));
					jobDTO.setPackages(lpa);
					jobDTO.setName(QualificationType.getByValue(qual));
					jobDTO.setPercentage(perctage);
					jobDTO.setFresher(fresh);
					return jobDTO;
				}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotal() {
       try {
		Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
	    String query = "select * from job.job_info ";
	    PreparedStatement statement = connection.prepareStatement(query);
	    ResultSet rs =  statement.executeQuery();
	    AtomicInteger auto = new AtomicInteger();
	    while(rs.next()) {
	    	auto.incrementAndGet();
	    	}
	    System.out.println("No of rows in Database :"+auto);
       } catch (SQLException e) {
		e.printStackTrace();
	}
    		   
    		   
		return 0; 
	}

	@Override
	public String isFresherById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
		    String query = "select fresher from job.job_info where "+" id ="+id;
		   Statement statement =connection.createStatement();
		 //   PreparedStatement statement = connection.prepareStatement(query);
		   // statement.setInt(1, id);
		    ResultSet resultset = statement.executeQuery(query);
		    while(resultset.next()) {
		    String fresh =resultset.getString(1);
		    return fresh;
		    }
		    
//		    while(resultset.next()) {
//		    	Integer id1 = resultset.getInt(1);
//				String dstn = resultset.getString(2);
//				Double lpa = resultset.getDouble(3);
//				String qual = resultset.getString(4);
//				Double perctage = resultset.getDouble(5);
//				String fresh = resultset.getString(6); 
//				System.out.println(" 2nd time get :"+id+" "+dstn+" "+ lpa+" "+qual+" "+perctage+" "+fresh);
//				JobDTO jobDTO = new JobDTO();
//				jobDTO.setId(id1);
//				jobDTO.setType(DesignationType.getValueBy(dstn));
//				jobDTO.setPackages(lpa);
//				jobDTO.setName(QualificationType.getByValue(qual));
//				jobDTO.setPercentage(perctage);
//				jobDTO.setFresher(fresh);
//				System.out.println(" hi");
//				return "";
//				
//		    }
		    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return "No data found";
	}

	@Override
	public Double getmaxPercentage() {
      try {
		Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
        String query = "select Percentage from job.job_info";
       // PreparedStatement statement = connection.prepareStatement(query);
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery(query);
        double max=0;
        while(resultset.next()) {
        	double percentage = resultset.getDouble(1);
        	if(percentage>max)
        		max=percentage;
        } return max;
        
        // Boolean b =resultset.next();
      //   System.out.println(b);
      }catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}



}
