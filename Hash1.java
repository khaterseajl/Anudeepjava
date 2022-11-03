package Com.hashset;

import java.util.HashSet;

/*WAP to create a HassSet and add 5 student's id(101,102,103,104,105)  and name as value.
Print the name of students whose id is greater than 103.*/
public class Hash1 { //main class
	static HashSet<Student1>hset;  //Make student class as static
	
	public static void printhash()//static method
	{
	 hset=new HashSet<>(); //instanciate static method
		Student1 s1=new Student1(101,"john", "58966721358"); //create objects of studnet 1
 		Student1 s2=new Student1(102,"Devis", "88966721358"); // object of student 2
 		Student1 s3=new Student1(103,"Aryan", "7966721358"); // object ofstudnet 3
		Student1 s4=new Student1(104,"Kavin",  "88966721358"); // object of student 4
		Student1 s5=new Student1(105,"Splitsvem", "98966721358"); //object of student 5
		
		hset.add(s1); //add object 1
		hset.add(s2); // add object 2
		hset.add(s3);  //add object 3
		hset.add(s4);  //add obejct 4
		hset.add(s5);  //add object 5
		
		for(Student1 student : hset) { //iterates for loop
			if (student.getId()>103) { //condition to check 
				System.out.println(student); //print the obejct
			}
		}
			
	}
	
	
	
	public static void main(String[] args)
	{
		printhash(); //call the method
	}
	}
	


