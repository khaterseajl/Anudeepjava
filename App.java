package LabTestjdbc1.JDBCTest1;

import java.sql.SQLException;
import java.util.Scanner;

import userdao.Userdaoclass;
import userdaoimpl.Usermaindao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Userdaoclass ud=new Usermaindao();
        
        System.out.println("1. To Create user:");
		System.out.println("2. To View user:");
		System.out.println("3. To View all users:");
		System.out.println("4. To Update user:");
		System.out.println("5. To Delete user:");
		System.out.println("9. To Exit:");
		
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Choice :");
			int ch=scan.nextInt();
			int i=0;
			switch (ch) {
			case 1:{
				System.out.println("Enter your user name:");
				String a=scan.next();

				System.out.println("Enter your password:");
				String b=scan.next();
			
				i=ud.insertuser(a, b);
				System.out.println(i + "record inserted...");
				break;
			}
			
			case 2:{
				System.out.println("Enter your user name:");
				String a=scan.next();
				
				System.out.println("your password does not contain  any space &not null:");
				String b=scan.next();
				
				ud.displayuser(a, b);
			    break;
			}
			
			case 3:{
				System.out.println("display all..");
				ud.displayuser();
				break;
			}
			
			case 4:{
				System.out.println("Enter password whose uname cant be updated:");
				String a1=scan.next();
				ud.updateuser(a1);
				System.out.println(i + "record updated...");
				break;
			}
			
			case 5:{
				System.out.println("enter your delete user name which u want:");
				String str=scan.next();
				ud.deleteuser(str);
				System.out.println(i + "record deleted...");
				break;
			}
		
			case 6:
				System.exit(0);
				
			default :
				System.out.println("Enter valid password...");

			}
				
			}
		catch(SQLException sq)
		{
			sq.printStackTrace();
		}
		
		
			
			}
}
