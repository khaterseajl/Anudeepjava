package Com.countvowels;

import java.util.Scanner;

public class Countvowels { //main class

	public static void main(String[] args) { //main method
		
		int count=0;  //initialize count variable
		System.out.println("Enter your string");
		Scanner scan=new Scanner(System.in);//scanner class
		String s1=scan.next();
	     s1.toLowerCase();//converte string to array using this method
		
	     try{ //try block
	    	 for(int i=0;i<s1.length();i++)  //for loop
	   
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'
					||s1.charAt(i)=='i'||s1.charAt(i)=='o'
					||s1.charAt(i)=='u'||s1.charAt(i)=='x') 
			count++;
	  
		System.out.println("no of vowels:"+count);
		throw new Exception("only contains vowels not x.."); //throw a new exception
	    }
	     catch(Exception e) //catch that exception occured in try block
	     {
	    	 System.out.println(e);
	     }
        finally  //finally block is called
        {
        	System.out.println("finally is called..");
        }
	}

}
