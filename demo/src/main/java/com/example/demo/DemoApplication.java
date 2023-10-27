package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;
import java.lang.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		String driver ="com.mysql.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/Sietk";
		String username ="root";
		String password ="Enter your mysql password";
		Class.forName(driver);

		Connection con =DriverManager.getConnection(url,username,password);
		Statement stmt =con.createStatement();

		//stmt.executeUpdate("insert into students values(1,'b')");

		ResultSet rs = stmt.executeQuery("select * from students");

		while(rs.next())
		{
			System.out.println(rs.getInt("id")+rs.getString("name"));
		}


		con.close();
	}

}
