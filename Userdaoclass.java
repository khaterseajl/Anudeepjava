package userdao;

import java.sql.SQLException;

public interface Userdaoclass {

	   //insert user..
		int insertuser(String uname,String password) throws SQLException;
		
		//display user..
		void displayuser(String uname ,String password) throws SQLException;
		
		//display all users
		void displayuser() throws SQLException;
		
		//update user
		int updateuser(String password) throws SQLException;
		
		//delete user
		int deleteuser(String uname) throws SQLException;
		

	
}
