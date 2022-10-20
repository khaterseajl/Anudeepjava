package Com.producerdemand;

public class demandthread  extends Thread{

	private Producer pro;

	public demandthread(Producer pro) {
		super();
		this.pro = pro;

	}
	
	public void run()
	{
		pro.demand(1200);
	}
}
