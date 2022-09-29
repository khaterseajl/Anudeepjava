package Membeproject3;
//declaring manager &employee info using main method
public class Managermain {
public static void main(String[] args)
{ 
	
	//instanciating objects of manager
	Manager m1=new Manager("mahendra",40,"96854233145","ranchi",45000,"sports");
	System.out.println("\nInformation about Manager:");
	m1.displayinfo(); //method returning of manager
	
	
	//instanciating objects of employee
	Employee1 emp1=new Employee1("sejal",21,"96482479566","shirur",20000,"CS");
	System.out.println("\n\nInformation about Employee:");
	emp1.Printinfo(); //method returning of employee
}
}
