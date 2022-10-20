package Com.producerdemand;    //package name

public class supplythread extends Thread {    //supplythread extending thread class

	private Producer pr;     //data member of producer

	public supplythread(Producer pro) {   //parameterized constructor
		super();
		this.pr = pro;   //this keyword represents current instance of

	}
	
	public void run()    //run method get overrided
	{
		pr.supply(1000);  //declare supplymethod
	}
}
