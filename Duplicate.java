
//write a program to display&duplicate char in string 
public class Duplicate {//main class
	//method 1
public static String duplicate(String str)//creating separate method to print duplicate char 
{
	String ref="learning is best earning";//ref string
	
	int length=str.length(); //declaring length of int
	char ch[]=str.toCharArray();//string method which converts string into char array
	
	//taking nested for loop
	for(int i=0;i<length;i++)//outer loop
	{
		for(int j=i+1;j<length;j++)//inner loop
		{
			if(ch[i]==ch[j])//conditional statement to check whether the given string contain duplicate char or not
			{
				System.out.println("Duplicate character is: "+ch[j]);
					break;//to break 
			}
		
		}		
		

		}
	return str;//returning string
	
}

public static void main(String[] args)//main method
{
	String s1="happy"; //string declared
	duplicate(s1);// calling method1 in main method
}}