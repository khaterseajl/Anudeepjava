package Com.Invalidmail;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Mailid { //main class
	public static void main(String[] args)  //main method
	{
		Scanner sc=new Scanner(System.in);   //scanner class
		System.out.println("Enter your Emailid: ");
		String mail=sc.next();
	
		try
		{
	if(mail.endsWith("@")||mail.endsWith("."))  //condition to be check
						
		System.out.println("invalid email id");    
	else
			if((mail.contains("@")&& mail.contains("."))) //nested if							System.out.println("valid email id ");
				
			System.out.println("valid email id");
	else
				System.out.println("valid email id");
		 
         throw new InvalidmailID(); //throw user defined new exception
      } 
	 catch (InvalidmailID ie)  //catch exception throw by user
	 {  
		System.out.println(ie);
		  }  
			}
			
			}
