package Com.producerdemand; //package

public class demandthread  extends Thread{ // demandthread extending thread 

	private Producer pro;   //data member of demandthread

	public demandthread(Producer pro) {    //parameterized constructor
		super();
		this.pro = pro;

	}
	
	public void run()     //run method overrided
	{
		pro.demand(1200);   //declare demand method 
	}
}
