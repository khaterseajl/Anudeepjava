package LabTest11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Testpalindrome {  //main class

	private static Palindrome pal; //priavte member
	
	@BeforeAll //before all annotation
	public static void beforeall() //method of before each
	{
		pal=new Palindrome();
		System.out.println("Before all tests....");
	}
	
	
	@ParameterizedTest //parameterizedtest annotation
	@ValueSource(strings = {"MOM","RADAR","121","level",""})
	
	@Test //test annotation
	public void ispalindrome(String s) //ispalindrome method
	{
		
		assertTrue(pal.palindrome(s));
	}
	
	
	@AfterAll //after all annooation
	public static void afterAllTests() //afterall test method
	{
		System.out.println("After all tests....");	
	}
}
