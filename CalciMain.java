//this is the main method in which we have created object of int &double values
public class CalciMain {
 public static void main(String[] args)//method
 {
	 Calculator1 calcii=new Calculator1();//instanciating object..
	 //declaring int values
	 System.out.println("addition of int:"+calcii.addition(7,0,9,6));
	 System.out.println("substraction of int:"+calcii.substraction(5,6));
	 System.out.println("multiplication of int:"+calcii.multi(7,2));
	 System.out.println("division of int:"+calcii.division(7,7));
	 //declaring double values
	 System.out.println("addition of double:"+calcii.addition(6.6,6.7));
	 System.out.println("substraction of double:"+calcii.addition(7.7,6.4));
	 System.out.println("multiplication of double:"+calcii.addition(7.7,6.7));
	 System.out.println("division of double :"+calcii.addition(6.7,7.7));
 }
}
