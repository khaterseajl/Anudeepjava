package LabTestjdbc1.HibernateSpring1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import LabTestjdbc1.HibernateSpring1.dao.Customerdao;


public class Testproducts {

   static Customerdao c;
	
	@BeforeAll
    public static void beforeAll() {
		System.out.println("Before all");
	}
	@Test
    public static void testGetCusotmer() {
		//negative test case
		ApplicationContext a=new ClassPathXmlApplicationContext("NewFile.xml");
		c= (Customerdao) a.getBean("CustomerDao");
		assertEquals(1, c.getCustomer(101).getPlist().size());
	}
	public static void test() {
		//positive test case
		ApplicationContext a=new ClassPathXmlApplicationContext("NewFile.xml");
		c= (Customerdao) a.getBean("CustomerDao");
		assertEquals(1, c.updateCustomer());
		
	
}
	public static void main(String[] args) {
		
		testGetCusotmer() ;
		test();
	}

}
