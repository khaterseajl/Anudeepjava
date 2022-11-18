package LabTest11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Testarraylist {

	private static ArrayList list;
	
	@BeforeAll //before all annoations
	public static void beforeall() //
	{
		list=new ArrayList(); //arraylist instanciating
		System.out.println("Before all tests....");
	}
	
	@Test //test annotation
	public void isempty() //isempty method
	{
	
		 assertEquals(true,list.isEmpty()); 
	}
	
	
	@Test //test annotation
	public void size() //size method
	{
		
	 assertEquals(0,list.size());	
	}
	
	

	@AfterAll
	public static void afterAllTests()
	{
		System.out.println("After all tests....");	
	}
}

