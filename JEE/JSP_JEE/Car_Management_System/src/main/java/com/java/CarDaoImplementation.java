package com.java;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDaoImplementation implements CarDao{

	@Override
	public void saveCar(Car car) {
		
		Connection connection=new DataBase().connect();
		try {
			
			PreparedStatement ps=connection.prepareStatement("insert into car values(?,?,?,?,?,?);");
			ps.setInt(1,car.getId());
			ps.setString(2,car.getName());
			ps.setString(3,car.getModel());
			ps.setString(4,car.getColor());
			ps.setDouble(5,car.getPrice());
			ps.setString(6,car.getOwner());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void CarUpdate(Car car) {
		
		Connection connection=new DataBase().connect();
		try {
			PreparedStatement ps=connection.prepareStatement("update car set id=?,name=?,model=?,color=?,price=?,owner=? where id="+car.getId()+";");
			ps.setInt(1,car.getId());
			ps.setString(2,car.getName());
			ps.setString(3,car.getModel());
			ps.setString(4,car.getColor());
			ps.setDouble(5,car.getPrice());
			ps.setString(6,car.getOwner());
			
			ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void CarDelete(Car car) {
		Connection connection=new DataBase().connect();
		try {
			Statement statement=connection.createStatement();
			statement.execute("delete from car where id="+car.getId()+";");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void findCar(Car car) {
		Connection connection=new DataBase().connect();
		try {
			Statement statement=connection.createStatement();
			statement.execute("select * from car where id="+car.getId()+";");
			ResultSet rs=statement.getResultSet();
			while(rs.next()) {
				car.setId(rs.getInt(1)); 
				car.setName(rs.getString(2)); 
				car.setModel(rs.getString(3)); 
				car.setColor(rs.getString(4)); 
				car.setPrice(rs.getDouble(5)); 
				car.setOwner(rs.getString(6)); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
