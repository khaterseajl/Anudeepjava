import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Studentmain {//main class

	public static void serializeStudent(Student st) throws IOException 
	{
		//creating output stream
	FileOutputStream fout=new FileOutputStream("E:\\Myfile2.txt");
	ObjectOutputStream oop=new ObjectOutputStream(fout);
	
	//write objects to student class
	oop.write(null);
	oop.flush();
	oop.close();
	fout.close();
	
	}
	
	public static Student deserializeStudent() throws IOException, ClassNotFoundException 
	{
		//creating input stream
		FileInputStream fin=new FileInputStream("E:\\Myfile2.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		//reading objects from file
		Student st=(Student)oin.readObject();
		oin.close();
		fin.close();
		return st;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		/*Student st=new Student(101, "Asha","8965427332");
		serializeStudent(st);
		System.out.println("successfully written");*/
				
	Student s1=deserializeStudent();
	System.out.println("Name:"+((Student) s1).getName());
	System.out.println("ID:"+((Student) s1).getId());
	System.out.println("ID:"+s1.getCont());
	
	}

}
