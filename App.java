package LabTestjdbc1.LabTestonStudent;

import java.util.Scanner;

import LabTestjdbc1.LabTestonStudent.daoimpl.Studentdaoimpl;
import LabTestjdbc1.LabTestonStudent.entities.Student1;
import LabTestjdbc1.LabTestonStudent.studentdao.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	displaystudent();	
    }
    
    public static void displaystudent()
    {
    	Student std=new Studentdaoimpl();
    	
    	System.out.println("Press 1. To Create Student:");
		System.out.println("Press 2. To Retrieve Studnet :");
		System.out.println("Press 3. To Update Studnet :");
		System.out.println("Press 4. To Delete Student :");
		System.out.println("Press 5. To Exit :");
        
		int id = 0;
		Student1 s;
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		switch (ch) {
		
		case 1:
			s=new Student1();
			s.setSid(2001);
			s.setSname("Shivaay");
			s.setContacts("8563954687");
			std.insertstudent(s);
			System.out.println(s);
			break;
			
		case 2:
			s=new Student1();
			s.setSid(101);
			s=std.getstudents(id);
			System.out.println(s);
			break;
			
		case 3:
			s=new Student1();
			s.setSid(400);
			std.updatestudent(id);
			System.out.println(s);
			break;
			
		case 4:
			s=new Student1();
			s.setSid(400);
			std.deletestudent(id);
			System.out.println(s);
			break;

	   case 5:
			scan.close();
			System.exit(0);
		    break;
		
		default :
			System.out.println("Enter valid choice...");

		
    }
}}
