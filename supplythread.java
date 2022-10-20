package Com.producerdemand;

public class supplythread extends Thread {

	private Producer pr;

	public supplythread(Producer pro) {
		super();
		this.pr = pro;

	}
	
	public void run()
	{
		pr.supply(1000);
	}
}
