package LabTest;
//WAP to create class for rectangle using constructors?
public class Area1 {
	int l;
	int w; 
	int area;
	Area1() //default constructor
	{
		System.out.println("\n default constructor is called___");
		l=0;
		w=0;
	}
	Area1( int l, int w)// parameterized constructor 
	{
		System.out.println("\n parameterized constructor is called___");
	    this.l=l;
	    this.w=w;
	    
	}
	 void displaymsg() // calculating area of rectangle
	{
		 area=l*w;
		System.out.println("area of rectangle is: "+area);
		
	}
	
   public static void main(String[] args)
   {
	   Area1 a1=new Area1(); //created instatiation of object
	   System.out.println("values for a1..");// for default const
		a1.displaymsg(); 
		
     	Area1 a2=new Area1( 12,12); // for parameterized const
	   System.out.println("values for a2..");
		a2.displaymsg(); 
			
		
		
   }
}
