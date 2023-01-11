package com.ibik.pbo.praktikum;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentsDao {
	
	private String queryInsert = "insert into students (npm,firstname,middlename, lastname, email, birthdate) " + "values (?,?,?,?,?,?)";
			 public void saved(Students students) throws Exception {

			 Connection c = new ConnectDB().connect();

			 PreparedStatement psInsert = c.prepareStatement(queryInsert);

			 psInsert.setString(1, students.getNpm());
			 psInsert.setString(2, students.getFirstname());
			 psInsert.setString(3, students.getMiddlename());
			 psInsert.setString(4, students.getLastname());
			 psInsert.setString(5, students.getEmail());
			 psInsert.setString(6, students.getBirthdate());

			 psInsert.executeUpdate();

			 c.close();
			 }
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
