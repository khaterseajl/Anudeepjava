package Com.student;

import java.util.Comparator;

public class Namecomparator implements Comparator<Student>{ //comparator inetrface

	@Override // override method
	public int compare(Student o1, Student o2) { //compare() of comparator interface
		
		return o1.getName().compareTo(o2.getName()); //return the  method
	}

}
