package Com.producerdemand;
/*Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct.*/
public class Producer {

	private int availableproduct=1000;
	
	synchronized public void demand(int demandno)
	{
		System.out.println("available product before demand"+availableproduct);
		try
		{
			if(demandno>availableproduct)
			wait();
			availableproduct-=demandno;
			System.out.println("available product after demand"+availableproduct);	
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	
	synchronized public void supply(int demandno)
	{
		System.out.println("available product before supply"+availableproduct);
		availableproduct+=demandno;
		System.out.println("available product after supply"+availableproduct);
		notify();
}
}