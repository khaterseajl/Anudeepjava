package LabTest11;

import java.util.ArrayList;

public class Arraylist { //main class

	public void arraylist() //method of arraylist
	{
		ArrayList <Integer> al=new ArrayList<Integer>(); //instanciating arraylist
		
		al.add(12); //add elemnts
		al.add(20);
		al.add(32);
		al.add(40);
		al.add(52);
		
		for(Integer i:al) //for loop
		{
			if(al.isEmpty()) // condition to check arraylist is empty or not
				System.out.println("arraylist is empty..");
			else
				System.out.println("not empty..");
	
			System.out.println(i); //print the arraylist
		}
		
	}
}
