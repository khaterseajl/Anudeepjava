package Com.fibo;

public class Fibomain {

	public static void main(String[] args) {
		
		Thread th=new Thread();  //instanciating thread class
		
		Fabonacci1 ft1=new Fabonacci1(); //instanciating fibonacci class
		fibonacci2 ft2=new fibonacci2(); //instanciating fibonacci2 class
		
		ft1.start();  //starting thread
		ft2.start();  //starting thread

	}

}
