//this is the main method in which we have created object of int &double values
public class CalciMain {
 public static void main(String[] args)//method
 {
	 Calculator1 calcii=new Calculator1();//instanciating object..
	 //declaring int method
	 System.out.println("addition of 2 int:"+calcii.addition(7,6));
	 System.out.println("substraction of 2 int:"+calcii.substraction(7,6));
	 System.out.println("multiplication of 2 int:"+calcii.multi(7,6));
	 System.out.println("division of 2 int:"+calcii.division(7,6));
	 //declaring double method
	 System.out.println("addition of 2 double:"+calcii.addition(6.6,6.7));
	 System.out.println("substraction of 2 double:"+calcii.addition(7.7,6.4));
	 System.out.println("multiplication of 2 double:"+calcii.addition(7.7,6.7));
	 System.out.println("division of 2 double :"+calcii.addition(6.7,7.7));
 }
}
