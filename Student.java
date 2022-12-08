package LabTestjdbc1.LabTestonStudent.studentdao;

import LabTestjdbc1.LabTestonStudent.entities.Student1;

public interface Student {

	public boolean insertstudent(Student1 s);
	
	public Student1 getstudents(int id);
	
	public boolean updatestudent(int id);
	
	public boolean deletestudent(int id);
	
	
	
}