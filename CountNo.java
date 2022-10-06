
//wap to count the total no of vowels and consonants present in string
public class CountNo {//main class
public static String count(String str)//main method
{	
	int v=0; //v variable for initializing vowels 
	int c=0;//c variable for initializing consonants 
	String ref=""; //reference string
 
  for(int i=0;i<str.length();i++ ) {//for loop 
   // if condi which check how much vowels present in given string
	  if(str.charAt(i)=='a'|| str.charAt(i)=='e'||
    		str.charAt(i)=='i'||str.charAt(i)=='o'||
    	str.charAt(i)=='u'){
    		v++;	
    	}
   
  //else if condition which check how much consonants present in given string
    else if(str.charAt(i)>='a' && str.charAt(i)<='z') {		
    		c++;
    		
    		}
  }
  System.out.println("no of vowels: "+v);
  System.out.println("no of consonants: "+c);
return str;//returning string

	}

public static void main(String[] args) //main method
{
String s1="shine"; //declared string in s1
count(s1);//called method 1 


}} 





