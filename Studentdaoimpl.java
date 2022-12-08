package LabTestjdbc1.LabTestonStudent.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import LabTestjdbc1.LabTestonStudent.entities.Student1;
import LabTestjdbc1.LabTestonStudent.provider1.Hiberutil1;
import LabTestjdbc1.LabTestonStudent.studentdao.Student;

public class Studentdaoimpl implements Student{

	Session ses=Hiberutil1.getsession();
	
	public boolean insertstudent(Student1 s) {
		Transaction tx=ses.beginTransaction();
		ses.save(s);
		tx.commit();
		ses.close();
		return true;
	}
	

	public Student1 getstudents(int id) {

		return ses.get(Student1.class, id);
	}

	public boolean updatestudent(int id) {
		Transaction tx=ses.beginTransaction();
		Student1 s=ses.get(Student1.class, id);
		s.setSid(id);
		ses.update(s);
		tx.commit();
		ses.close();
		return true;
	}

	public boolean deletestudent(int id) {
		Transaction tx=ses.beginTransaction();
		Student1 s=ses.get(Student1.class, id);
		ses.delete(s);
		tx.commit();
		ses.close();
		return true;
	}

	
	}


