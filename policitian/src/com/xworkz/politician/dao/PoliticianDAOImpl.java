package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.policitian.dto.PoliticianDTO;
import com.xworkz.politician.constants.PartyName;
import com.xworkz.politician.constants.PartySymbol;

import static com.xworkz.politician.constants.DBProperties.*;

public class PoliticianDAOImpl implements PoliticianDAO{

	@Override
	public boolean save(PoliticianDTO politicianDTO) {
		
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			String query = "insert into policitian.politician_info values (?,?,?,?,?,?,?,?,?) ";
		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, politicianDTO.getId());
		    statement.setString(2, politicianDTO.getPartyName().getPartyName());
		    statement.setString(3, politicianDTO.getPresident());
		    statement.setDouble(4, politicianDTO.getTotalMembers());
		    statement.setString(5, politicianDTO.getPartySymbol().getPartySymbol());
		    statement.setString(6, politicianDTO.getPartyColor());
		    statement.setString(7, politicianDTO.getPartyLocation());
		    statement.setString(8, politicianDTO.getPartyState());
		    statement.setDouble(9, politicianDTO.getBudget());
		    
		    int rowsAffected = statement.executeUpdate();
		    
		    if(rowsAffected>0) {
		    	System.out.println("Data saved :"+ rowsAffected);
		    	return true;
		    }else {
		    	System.out.println("Data not saved");
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PoliticianDTO findById(int id) {
        try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
		    String query = "select * from policitian.politician_info where id=?";
		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, id);
		    ResultSet rs = statement.executeQuery();
		    while(rs.next()) {
		    	Integer id1 = rs.getInt(1);
		    	String name=rs.getString(2);
		    	String president = rs.getString(3);
		    	double tm = rs.getDouble(4);
		    	String psl = rs.getString(5);
		    	String pc = rs.getString(6);
		    	String pl = rs.getString(7);
		    	String ps = rs.getString(8);
		    	double pb = rs.getDouble(9);
		       System.out.println(id1+" "+name);
		       
		       PoliticianDTO pdto = new PoliticianDTO();
		       pdto.setId(id);
		       pdto.setPartyName(PartyName.getValueBy(name));
		       pdto.setPresident(president);
		       pdto.setTotalMembers(id);
		       pdto.setPartySymbol(PartySymbol.getbyvalue(psl));
		       pdto.setPartyColor(pc);
		       
		       pdto.setPartyLocation(pl);
		       pdto.setPartyState(ps);
		       pdto.setBudget(pb);
		       return pdto;
		    }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndPresident(int id, String president) {
	    try {
				Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			    String query = "select * from policitian.politician_info where id=? and President=?";
			    PreparedStatement statement = connection.prepareStatement(query);
			    statement.setInt(1, id);
			    statement.setString(2, president);
			    ResultSet rs = statement.executeQuery();
			    while(rs.next()) {
			    	Integer id1 = rs.getInt(1);
			    	String name=rs.getString(2);
			    	String president1 = rs.getString(3);
			    	double tm = rs.getDouble(4);
			    	String psl = rs.getString(5);
			    	String pc = rs.getString(6);
			    	String pl = rs.getString(7);
			    	String ps = rs.getString(8);
			    	double pb = rs.getDouble(9);
			       System.out.println(id1+" "+name);
			       
			       PoliticianDTO pdto = new PoliticianDTO();
			       pdto.setId(id);
			       pdto.setPartyName(PartyName.getValueBy(name));
			       pdto.setPresident(president);
			      
			       pdto.setTotalMembers(id);
			       pdto.setPartySymbol(PartySymbol.getbyvalue(psl));
			       pdto.setPartyColor(pc);
			       
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setBudget(pb);
			       return pdto;
			    }
	    } catch (SQLException e) {

			e.printStackTrace();
			    }
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndPresidentAndName(int id, String president, String name) {
		  try {
				Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			    String query = "select * from policitian.politician_info where id=? and President=? and Name=?";
			    PreparedStatement statement = connection.prepareStatement(query);
			    statement.setInt(1, id);
			    statement.setString(2, president);
			    statement.setString(3, name);
			    ResultSet rs = statement.executeQuery();
			    while(rs.next()) {
			    	Integer id1 = rs.getInt(1);
			    	String name1=rs.getString(2);
			    	String president1 = rs.getString(3);
			    	double tm = rs.getDouble(4);
			    	String psl = rs.getString(5);
			    	String pc = rs.getString(6);
			    	String pl = rs.getString(7);
			    	String ps = rs.getString(8);
			    	double pb = rs.getDouble(9);
			       System.out.println(id1+" "+name);
			       
			       PoliticianDTO pdto = new PoliticianDTO();
			       pdto.setId(id);
			       pdto.setPartyName(PartyName.getValueBy(name));
			       pdto.setPresident(president);
			      
			       pdto.setTotalMembers(id);
			       pdto.setPartySymbol(PartySymbol.getbyvalue(psl));
			       pdto.setPartyColor(pc);
			       
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setBudget(pb);
			       return pdto;
			    }
	    } catch (SQLException e) {

			e.printStackTrace();
			    }
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndName(int id, String name) {
		  try {
				Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			    String query = "select * from policitian.politician_info where id=?  and Name=?";
			    PreparedStatement statement = connection.prepareStatement(query);
			    statement.setInt(1, id);
			    statement.setString(2, name);
			    ResultSet rs = statement.executeQuery();
			    while(rs.next()) {
			    	Integer id1 = rs.getInt(1);
			    	String name1=rs.getString(2);
			    	String president1 = rs.getString(3);
			    	double tm = rs.getDouble(4);
			    	String psl = rs.getString(5);
			    	String pc = rs.getString(6);
			    	String pl = rs.getString(7);
			    	String ps = rs.getString(8);
			    	double pb = rs.getDouble(9);
			       System.out.println(id1+" "+name);
			       
			       PoliticianDTO pdto = new PoliticianDTO();
			       pdto.setId(id);
			       pdto.setPartyName(PartyName.getValueBy(name));
			       pdto.setPresident(president1);
			      
			       pdto.setTotalMembers(id);
			       pdto.setPartySymbol(PartySymbol.getbyvalue(psl));
			       pdto.setPartyColor(pc);
			       
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setBudget(pb);
			       return pdto;
			    }
	    } catch (SQLException e) {

			e.printStackTrace();
			    }
		return null;
	}

	@Override
	public String findNamebyId(int id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
		    String query = "select Name from policitian.politician_info where "+" id ="+id;
		   Statement statement =connection.createStatement();
		 //   PreparedStatement statement = connection.prepareStatement(query);
		   // statement.setInt(1, id);
		    ResultSet resultset = statement.executeQuery(query);
		    while(resultset.next()) {
		    String fresh =resultset.getString(1);
		    return fresh;
		    }
		    

		    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return "No data found";
	}

	@Override
	public String findPresidentByIdAndName( int id,String name) {
		  try {
				Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			    String query = "select President from policitian.politician_info where "+" id ="+id +"Name ="+ name;
//			    PreparedStatement statement = connection.prepareStatement(query);
//			    statement.setInt(1, id);
//			    statement.setString(2, name);
			    Statement statement = connection.createStatement();
			    ResultSet rs = statement.executeQuery(query);
			    while(rs.next()) {
			    	System.out.println("hgsxxjhvxs");
			    	//Integer id1 = rs.getInt(1);
			    	String name1 = rs.getString(2);
			    	return   name1;
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
			    String query = "select * from policitian.politician_info ";
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
	public  PoliticianDTO findPartyByMaxMembers()  {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String selectSql="Select max(TotalMembers) as maximumMember from policitian.politician_info";
			PreparedStatement statement=connection.prepareStatement(selectSql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				Integer id1 = rs.getInt(1);
		    	String name1=rs.getString(2);
		    	String president1 = rs.getString(3);
		    	double tm = rs.getDouble(4);
		    	String psl = rs.getString(5);
		    	String pc = rs.getString(1);
		    	String pl = rs.getString(1);
		    	String ps = rs.getString(1);
		    	double pb = rs.getDouble(1);
				PoliticianDTO pdto=new PoliticianDTO();
				pdto.setId(id1);
				 pdto.setPartyName(PartyName.getValueBy(name1));
			     pdto.setPresident(president1);
			      
			       pdto.setTotalMembers(tm);
			       pdto.setPartySymbol(PartySymbol.getbyvalue(psl));
			       pdto.setPartyColor(pc);
			       
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setBudget(pb);
			       return pdto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
       
		return null;
	}

}
