package LabTestjdbc1.LabTestonStudent.provider1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberutil1 {

	public static Session getsession()
	{
		Configuration confi=new Configuration();
        confi.configure();
		
		SessionFactory factory=confi.buildSessionFactory();
		
		return factory.openSession();
}
}