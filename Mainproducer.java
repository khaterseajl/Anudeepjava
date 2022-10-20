package Com.producerdemand;

public class Mainproducer {

	public static void main(String[] args) {
		
		Producer p=new Producer();
		
		demandthread dt=new demandthread(p);
		supplythread st=new supplythread(p);
		
		dt.start();
		st.start();

	}

}
