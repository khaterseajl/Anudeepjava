import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

//import Com.Invalidmail.InvalidmailID;

/*3.WAP to write  objects  Student class in a file and then read Student objects from file print to console  whose name starts with "A".
(Student---id,name,contact); */
public class Student {//main class

	//data members of student class
	int id;  //student id
	String name; //student name
	String cont; //student contact no
 
	public Student() {  //generate default constructor
		super();
		}

	public Student(int id, String name, String cont) { //generate parameterized constructor
		super();
		this.id = id;
		this.name = name;
		this.cont = cont;
	}
	
	public int getId() { //generate getters and setters methods
		return id;
	}

	public void setId(int id) { //set id
		this.id = id;
	}

	public String getName() { //get name
		return name;
	}

	public void setName(String name) {// set name
		this.name = name;
	}

	public String getCont() { //get contno
		return cont;
	}

	public void setCont(String cont) { //set contcno
		this.cont = cont;
	}
	}


