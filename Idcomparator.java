package Com.student;

import java.util.Comparator;

public class Idcomparator implements Comparator<Student>{ //comparator interafce

	@Override //override method
	public int compare(Student o1, Student o2) {  //comapre method of comarator interface
		if(o1.getId()>o2.getId())
			return 1;
		else if(o1.getId()<o2.getId())
			 return -1;
		else
		return 0;
	}

}
