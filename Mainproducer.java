package Com.producerdemand;

public class Mainproducer {  //main class of producer

	public static void main(String[] args) {  main method
		
		Producer p=new Producer();  //instanciating producer classs by making oject of producer classs
		
		demandthread dt=new demandthread(p);  //instanciating demandthread 
		supplythread st=new supplythread(p);  //instanciating  supplythread
		
		dt.start();   //starting thread  dt
		st.start();   //starting thread  st

	}

}
