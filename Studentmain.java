package Com.student;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;


public class Studentmain { //main class
	public static ArrayList<Student>st; 
  public static void fillset() //static method to fillarraylist
	{
	 
	ArrayList <Student> st=new ArrayList<>(); // instanciate Arraylist1
    Student st1=new Student(111,"sejal",  "8986594236"); //instantiate student1 object
    Student st2=new Student(112,"Disha",  "9986594236"); // instanciate student 2
    Student st3=new Student(113,"Aarghya", "7986594236"); // instanciate student3
	    
    st.add(st1); //add method will add studnet object1 
    st.add(st2); // add object2
    st.add(st3); // add object3
	    
      ArrayList <Student> str=new ArrayList<>();//	instanciate Arraylist 2
	  Student str1=new Student(101,"pihuu", "7986594236");//instantiate student1 object
	  Student str2=new Student(102,"Mahii", "786594236"); //instantiate student2
      Student str3=new Student(103,"Kavin", "8886594236");//instantiate student3
	   
	    str.add(str1); //add list 1 into list 1
	    str.add(str2); //add list 2 into list 1
	    str.add(str3); //add list 3 into list 1
	    
	    st.addAll(str); //addall method which adds Studnet 1 into Student 2
	
	    Iterator<Student>itr= st.iterator(); //iterator which iterates lists
		
		while(itr.hasNext()) //while loop for iteration
		{
			System.out.println(itr.next()); //sop 
		}
	}
		/*Collections.sort(st, new Idcomparator()); //sort method to sort id,name
		
		System.out.println("\nAfter sorting Student id........ ");
		itr=st.iterator(); //iterator
		   
		while(itr.hasNext())  //while loop
		{
			System.out.println(itr.next()); //sop
		}
		}
	   */

	public static void main(String[] args) { //main method
		fillset(); //call the method
		

	}

}
