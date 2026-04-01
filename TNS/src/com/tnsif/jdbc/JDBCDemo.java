package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Demo for CURD operations
public class JDBCDemo {
	//seven steps
	//load the driver
	//private static String DRIVERNAME="org.postgresql.Driver";
	private static String USERNAME="postgres";
	private static String PASSWORD="Deepu24";
	//private static String DBNAME="KPRIT";
	private static String URL="jdbc:postgresql://localhost:5432/Sfbatch5"
	;
	
	public static void main(String[] args) {
		try {
			
			//1. load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
			
			//2. Get the connection
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connection established");
			
			//3. create the statement
			String query="select * from student";
			Statement stmt=con.createStatement();
			
			//4.Execute query
			
			
			//5.Retrieving the data
			ResultSet rs =stmt.executeQuery(query);;
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
			//	System.out.print(rs.getString(3));
				System.out.println();
			}
			
			//6.close the resources
			stmt.close();
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
	}
}
