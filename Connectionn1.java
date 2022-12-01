package LabTestjdbc1.JDBCTest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionn1 {

	public static Connection getconnection() {
		try {	
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Sejal@123.4");
			}
			catch(SQLException sq) {
				sq.printStackTrace();
			}
			
		return null;
	}
}
