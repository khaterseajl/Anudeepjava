package LabTest;
//WAP to find sum of no from 1 to 100 using for loop?
public class Sum
{
	void addnumber() { // created method name as addnumber
int n=100,sum=0; 
		
		for(int i=1;i<=100;++i) //i=1,1<=100 
		{	
			sum +=i; 
			//sum=sum+i; 
			//0=0+1=1+1=2+1=3+1=4.....so on till 100
		
		}
		System.out.println("sum of numbers from 1 to 100: "+sum);
	}
    public static void main(String[] args) {
  	Sum d1 =new Sum(); // created instantiation of object using new keyword
    	d1.addnumber(); // called the method
		}}
    



