
public class Calculator
{
	//method that takes variable
	//number of integer argument
	public int addition(int... n1) 
	{
		System.out.println("Addition of Integer : ");
		int sum=0;
		for (int i = 0; i < n1.length; i++)// using for each loop to display contents of n1
		{
			sum +=n1[i];           //integer addition
		}
		return sum;

	}
	public double addition(double... n1) 
	{
		System.out.println("Addition of Double : ");
		double sum=0;
		for (int i = 0; i < n1.length; i++) 
		{
			sum +=n1[i];             //double addition
		}
		return sum;
	}
	
	
	public int subtraction(int... n1)
	{
		System.out.println("Subtraction of Integer : ");
		int sub = 0;
		for (int i = 0; i < n1.length; i++)
		{
			sub -=n1[i];            //integer Subtraction
		}
		return sub;

	}
	public double subtraction(double... n1)
	{
		System.out.println("Subtraction of Double : ");
		double sub=0;
		for (int i = 0; i < n1.length; i++)
		{
			sub -=n1[i];        //double Substraction
		}
		return sub;
	}
	
	
	public int multiplication(int... n1)
	{
		System.out.println("Multiplication of Integer : ");
		int mul=1;
		for (int i = 0; i < n1.length; i++) 
		{
			mul *=n1[i];        //integer Multiplication
		}
		return mul;

	}
	public double multiplication(double... n1)
	{
		System.out.println("Multiplication of Double : ");
		double mul=1;
		for (int i = 0; i < n1.length; i++) 
		{
			mul *=n1[i];             //double Multiplication
		}
		return mul;
	}
	
	public int division(int... n1)
	{
		System.out.println("Division of Integer : ");
		int div=1;
		for (int i = 0; i < n1.length; i++) 
		{
			div /=n1[i];                   //integer division
		}
		return div;

	}
	public double division(double... n1) 
	{
		System.out.println("Division of Double : ");
		double div=1;
		for (int i = 0; i < n1.length; i++) 
		{
			div /=n1[i];                     //double division
		}
		return div;
	}
	
	
	public static void main(String[] args) 
	{
		
     Calculator cal=new Calculator();
   //calling the varargs method with different number of parameter
     
     System.out.println(cal.addition(3,4,5,7));//four parameter
     System.out.println(cal.addition(10,30));//two parameter

     System.out.println(cal.addition(8.0,9,10.0));

     System.out.println(cal.subtraction(20,2));
     System.out.println(cal.subtraction(100.0,15));

     System.out.println(cal.multiplication(8,2,3));
     System.out.println(cal.multiplication(6.0,7,8.5));

     System.out.println(cal.division(450,6));
     System.out.println(cal.division(700,2.0,7));
	}

}

