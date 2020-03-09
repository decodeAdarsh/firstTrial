package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMain {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//type 4 thin driver
		Connection dbcon= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","9853942102");
		System.out.println("Connection established");
		//PreparedStatement stmt=dbcon.prepareStatement("INSERT INTO CONTACT VALUES(?,?,?)");
		//PreparedStatement stmt=dbcon.prepareStatement("DELETE FROM CONTACT WHERE ID=?");
		PreparedStatement stmt=dbcon.prepareStatement("UPDATE CONTACT SET NAME=? WHERE ID =?");
		//stmt.executeUpdate("INSERT INTO CONTACT VALUES(4,'Anand','00089')");
		//stmt.executeUpdate("DELETE FROM CONTACT WHERE Id=4");
		//stmt.executeUpdate("UPDATE CONTACT SET Name = 'ROUT', Phone= '0000' WHERE Id = 1");
		//stmt.executeUpdate("CREATE TABLE employee (EmpID INT PRIMARY KEY,EmpName VARCHAR(14),EmpNo VARCHAR(13))");
		//stmt.setInt(1,5);
		//stmt.setString(2,"Surmka");
		//stmt.setString(3,"089087");
		stmt.setString(1,"ADARSH");
		stmt.setInt(2,1);
		int updates = stmt.executeUpdate();
		System.out.println(updates+" updates done.");
		ResultSet rs=stmt.executeQuery("SELECT * FROM CONTACT");
		while(rs.next()) {
			int id=rs.getInt("Id");
			String name=rs.getString("Name");
			String phone=rs.getString("Phone");
			System.out.println(id+" - "+name+" - "+phone);
		}
		
		rs.close();
		stmt.close();
		dbcon.close();

	}

}
