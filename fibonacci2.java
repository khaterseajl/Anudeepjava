package Com.fibo;
/*To display 1 to 10 in reverse order.*/
public class fibonacci2 extends Thread{ //extending fibonacci2 class by making thread

	public fibonacci2() { //default constructor
		super();
		
	}

	public fibonacci2(String name) {  //parameterized constructor
		super(name);
	
	}
	
	synchronized public void run() //make run method synchronized which will put lock
	{
		System.out.println("1 to 10 nos in reverse order:");
		for(int i=10;i>=1;i--) //for loop
		{
			System.out.println(i); //print i to display  reverse series
		}
	}
	
	
}
