import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employeemain {  //main class

	public static void main(String[] args) { //main method
		
		//instanciate arraylsit of employee
		ArrayList <Employee> emp=new ArrayList<>();   
		
		//create 6 instance of employee
		Employee em1=new Employee("Raunak",23,"sales dpt",34000);
		Employee em2=new Employee("Kartik",34,"income tax dpt",45000);
		Employee em3=new Employee("Suhani",33,"magic dpt",30000);
		Employee em4=new Employee("Kavin",22,"management dpt",20000);
		Employee em5=new Employee("Mahii",21,"sports dpt",670000);
		Employee em6=new Employee("Sid",25,"hr dpt",37000);
	
		//add those employess into list
	   emp.add(em1);
	   emp.add(em2);
	   emp.add(em3);
	   emp.add(em4);
	   emp.add(em5);
	   emp.add(em6);
	   
		
		//solution of Q1..
	   System.out.println("\nprinting employee name in sorted order using lambda expresiion...");
	   List <Employee>list=(emp.stream().sorted((e1,e2)->e1.getAge()>e2.getAge()?1:-1).collect(Collectors.toList()));
	   System.out.println(list);
	       
	   Collections.sort(emp, (e1,e2)->{  //sort the employees names
	       return e1.getName().compareTo(e2.getName());
	      
	       
	   });
		
		//solution of Q2....
	     
	   System.out.println("Printing maximum salary using stream and filter ....");
	  // List <Employee> l1=((emp.stream().filter(i->i.getSalary()>10000)).collect(Collectors.toList()));
       System.out.println(list);
       
		
		//solution of Q3.......
	System.out.println("\nTotal count of books is :"+emp.stream().count());
	
    System.out.println("Maximum salary of employee is:"+emp.stream().max((e1,e2)-> e1.getSalary()>e2.getSalary()?1:-1).get());}}
	
	   
	
	
