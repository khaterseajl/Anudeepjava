import java.util.Scanner;

//wap to check whether a string entered is palindrome or not?
public class PalindromeNo {//main class
public static String palindrome() //method 1
// creating separate method 
{
	String str=""; //taking  string as str variable
	String rev="";// taking  string as rev variable
	
	int length=0; //it will print length of given string
	for(int i = length - 1; i >= 0; i-- ) //for loop
        rev = rev + str.charAt(i);//using string charAt method

     if (str.equals(rev)) //condi statement
        System.out.println("This is a palindrome"+str);
     else
        System.out.println("This is not a palindrome"+str);
		
	return str;//returning above string
}

public static void main(String[] args)
{
System.out.println("Enter String Here"); //main method
Scanner sc=new Scanner(System.in);//scanner class
 sc.next(); //nextline method
 
 palindrome();//called method 1
}}