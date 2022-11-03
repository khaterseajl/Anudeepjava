package Com.treeset;
/*Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
Get the number of elements in  tree set and print first and last element of treeset.*/
import java.util.TreeSet;
import java.util.ArrayList;
import Com.student.Student;
import Com.student.Studentmain;
import Com.student.*;
public class Treesetmain {

	public static void main(String[] args) { //main method
		
	TreeSet<Student> tset=new TreeSet<>(); //create treeset object
	
	Studentmain.fillset(); //call method of studnetmain class
	tset.addAll(Studentmain.st); //addall 
	tset.addAll(Studentmain.st); //addall
	
	System.out.println("Number of elements:"+tset.size()); //size method which print how many objects are there
	System.out.println("adds elements in first:"+tset.pollFirst()); //it will print first element 
	System.out.println("adds elements in last:"+tset.pollLast());///it will print last element 
	
	}

}
