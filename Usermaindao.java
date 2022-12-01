package userdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import LabTestjdbc1.JDBCTest1.Connectionn1;
import userdao.Userdaoclass;

public class Usermaindao implements Userdaoclass  {
	
	Connection con1=Connectionn1.getconnection();

	public int insertuser(String uname, String password) throws SQLException {
		String query="insert into user(uname,password) values(?,?)";
		PreparedStatement pst= con1.prepareStatement(query);
		pst.setString(1, uname);
		pst.setString(2, password);
		int i=pst.executeUpdate();
		return i;
	}
	
	public void displayuser(String uname, String password) throws SQLException {
		String query= "select * from user where password=(?)";
		PreparedStatement pst= con1.prepareStatement(query);
		pst.setString(1,uname);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery(query);
		 rs.next();
		 
	    	System.out.println("uname :"+rs.getString(1));
	    	System.out.println("password :"+rs.getInt(2));
	    	System.out.println("......................................................");
		
	}
	
	public void displayuser() throws SQLException {
		String query="select * from user";
		Statement st1=con1.createStatement();
		ResultSet rs=st1.executeQuery(query);
		while(rs.next())
		{
		 
	    	System.out.println("uname :"+rs.getString(1));
	    	System.out.println("password :"+rs.getInt(2));
	    	System.out.println("......................................................");
		}
	}
		public int updateuser(String password) throws SQLException {
			String query="update brand set password=(?) where uname=(?)";
			PreparedStatement pst=con1.prepareStatement(query);
			pst.setString(2, password);
			int i=pst.executeUpdate();
			return i;
		}

	public int deleteuser(String uname) throws SQLException {
		String qry= "delete from user where uname=(?) ";
		PreparedStatement pst=con1.prepareStatement(qry);
		pst.setString(1, uname);
		int i=pst.executeUpdate();
		return i;
	}
	
		
	
	
	

}
