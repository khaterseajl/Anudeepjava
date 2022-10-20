package Com.fibo;
/*Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.*/
public class Fabonacci1 extends Thread {//exteding fabonacii thread class

	public Fabonacci1() {  //default constructor
		super();
		
	}

	public Fabonacci1(String name) {  //parameterized constructor
		super(name);
	
	}
	
	synchronized public void run() {  // make run method overrided &synchronized
		
		System.out.println("fibonaci series:"); //sop
		int n1=0; // 1st member
		int n2=1;  //2nd member
		 for(int i=2;i<=10;++i)  //for loop
		 { 
			 int n3=n1+n2;  //add n1,n2 into n3 to get fibo series
			 n1=n2; //assign n1=n2
			 n2=n3;  //assign n2=n3
			 System.out.print(" "+n3);//print n3 to display fibo series
			 
		 }}
	}

