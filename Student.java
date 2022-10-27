import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

//import Com.Invalidmail.InvalidmailID;

/*3.WAP to write  objects  Student class in a file and then read Student objects from file print to console  whose name starts with "A".
(Student---id,name,contact); */
public class Student { //main class

	//data members of student class
	int id;  //student id
	String name; //student name
	String cont; //student contact no
 
	public static void Checkname(String name,int id,String contno) throws IOException {
		
	FileInputStream fin=new FileInputStream("E:\\Myfile2.txt");//inputfile to read
	FileOutputStream fout=new FileOutputStream("E:\\Myfile2.txt"); //file output yo write

	
	if(Pattern.matches("[A]\\w[^A]+" ,name)) //condition checking with the help of pattern matches
	{
		System.out.println("Valid Student.."); //to print if valid
	}
	else{ //else part
	
		System.out.println("invalid Student.."); //to print if not valid
	}
		 
	
		

	}

}
