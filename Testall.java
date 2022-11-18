package LabTest11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit1demo.Calculator1;

public class Testall { //class

	private static Add_multi am; //private member
	
	@BeforeEach //before each annotation
	public void beforeach() //before each method
	{
		System.out.println("Before Each....");	
	}
	
	@BeforeAll //before all annotations
	public static void beforeall() //before all method
	{
		am=new Add_multi(); //declare intance of class
		System.out.println("Before all tests....");
	}
	
	
	@Test //test annotation
	public void testadd() //add method
	{
	    assertEquals(50,am.add(10,40));  //assert method
		
	}
	
	@Test //test annotation
	public void testmulti() //multi method
	{
	    assertEquals(1200,am.multi(30,40)); //assert equals
		
	}
	
	@AfterAll //after all annotation
	public static void afterAllTests() //afteralltest method
	{
		System.out.println("After all tests....");	
	}

	@AfterEach //after each annotation
	public  void aftereach() //after each method
	{ 
		System.out.println("After Each tests....");	
	}
	
}
