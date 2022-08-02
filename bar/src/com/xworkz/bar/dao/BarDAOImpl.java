package com.xworkz.bar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

import com.xworkz.bar.dto.BarDTO;

import static com.xworkz.bar.constant.MysqlProperties.*;


public class BarDAOImpl implements BarDAO {

	@Override
	public boolean save(BarDTO barDTO)  {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			
			String insert = "insert into bar.bar_info values ("+barDTO.getId()+",'"+barDTO.getName()+"','"+barDTO.getLocation()+"','"+barDTO.getType().getBar()+"','"+barDTO.getAvgCollectionperDay()+"','"+barDTO.getAvgCollectionperMonth()+"')";
			Statement statement = connection.createStatement();
			Integer affected = statement.executeUpdate(insert);
			
			if(affected>0) {
				System.out.println(" data saved :"+ insert);
				return true;
			}
				else {
					System.out.println("data not saved ");
					return false;
				}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return false;
	}

}
