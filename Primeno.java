package LabTest;
//WAP to find prime no from 1 to 20 using for loop?
public class Primeno{
	void printprimeno(int n) //n=20
	{
     	int i;
	   for(i=2;i<=20;i++) // i=2
	   {   
		   if(n %i==0) //2%2==0
		   {
		 System.out.println( n+"this no is not prime no ");
		   break;
		   }
	   }
	   if(i==n)  // f
		 System.out.println(n + "this no is prime no ");
	}
	
	    
  public static void main(String[] args)
  {
	Primeno p1=new Primeno(); 
	p1.printprimeno(5);
	p1.printprimeno(8);
	p1.printprimeno(11);
	p1.printprimeno(20);
	
  }
}
