package LabTest11;

import java.util.ArrayList;

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
		System.out.println("list is not empty..");
		 equals(list.isEmpty()); 
	}
	
	
	@Test //test annotation
	public void size() //size method
	{
		System.out.println("size:");
	 equals(list.size());	
	}
	
	

	@AfterAll
	public static void afterAllTests()
	{
		System.out.println("After all tests....");	
	}
}

