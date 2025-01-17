package com.java;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImp implements StudentDao {

	Connection connection=DataBaseConfig.getConnection();

	@Override
	public boolean saveStudent(Student student) {
		
	try{
			PreparedStatement ps=connection.prepareStatement("insert into student values(?,?,?,?,?,?,?);");
		
			ps.setInt(1,student.getRoll());
			ps.setString(2,student.getName());
			ps.setString(3,student.getEmail());
			ps.setString(4,student.getPsw());
			ps.setLong(5,student.getPhone());
			ps.setString(6,student.getAddress());
			ps.setInt(7,student.getAge());
		
			int execute=ps.executeUpdate();
			if(execute>0) {
				return true;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return false;
	}
	
	
	@Override
	public Student findStudentById(int id) {
		
		Student student1=new Student();
		
		try {
			PreparedStatement ps=new DataBaseConfig().getConnection().prepareStatement("select * from student where rollno="+id+";");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				student1.setRoll(rs.getInt(1));
				student1.setName(rs.getString(2));
				student1.setEmail(rs.getString(3));
				student1.setPsw(rs.getString(4));
				student1.setPhone(rs.getLong(5));
				student1.setAddress(rs.getString(6));
				student1.setAge(rs.getInt(7));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student1;
		
		
	}

	@Override
	public boolean updateStudent(Student student) throws SQLException {
		
		PreparedStatement ps=connection.prepareStatement("update student set rollno=?,name=?,email=?,pass=?,phone=?,address=?,age=? where rollno=?;");
		ps.setInt(1, student.getRoll());
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		ps.setString(4, student.getPsw());
		ps.setLong(5, student.getPhone());
		ps.setString(6, student.getAddress());
		ps.setInt(7, student.getAge());
		ps.setInt(8, student.getRoll());
		int execute=ps.executeUpdate();
		if(execute>0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
}
