package LabTest11;

public class Palindrome {

	public boolean palindrome(String s) //method of palindrome
	{
		
		for(int i=0;i<=s.length()-1;) //for loop
		{
			int j = 0;
		  while(i<j) //while loop
		  {	
			if(s.charAt(i)!=s.charAt(j))
                  return false;
			i++;
			j--;
           }
             return true;
		}	
		
	
		if(palindrome(s)) //if condition check
		System.out.println("palindrome string : ");
		else 
			System.out.println("not palindrome string : ");
		return false; //returning method
	
	
		
	}
}
