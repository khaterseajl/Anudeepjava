package Com.producerdemand;
/*Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct.*/
public class Producer {     //producer class

	private int availableproduct=2000;   //declared data members of producer
	
	synchronized public void demand(int demandno)     //maked demand method synchronized 
	{
		System.out.println("available product before demand"+availableproduct);  //sop to print on console
		try    // try block to catch exception
		{
			if(demandno>availableproduct)    //if checkes demand number is greater than availableproduct
			wait();    //method get in waiting state untill demand no is not increased
			availableproduct-=demandno;
			System.out.println("available product after demand"+availableproduct);	
		}
		catch(InterruptedException ie)    //catching that  ty block exception 
		{ 
			System.out.println(ie);
		}
	}
	
	synchronized public void supply(int demandno)    //maked supply method as a synchronized
	{
		System.out.println("available product before supply"+availableproduct);
		availableproduct+=demandno;  //increasing demand no
		System.out.println("available product after supply"+availableproduct);
		notify(); // notify which is used to communication between thread
}
}
