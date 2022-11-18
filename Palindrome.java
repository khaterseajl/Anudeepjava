package LabTest11;

public class Palindrome {

	public boolean palindrome(String s) //method of palindrome
	{
		StringBuffer sb=new StringBuffer(s);
		String rev=new String(sb.reverse());
		if(rev.equals(s))
			return true;
		else
		return false;
		
		
	}
}
