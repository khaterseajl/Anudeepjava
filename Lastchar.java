import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Lastchar {  //main class

	public static void main(String[] args) throws IOException { //main method throws exception
		
	File f=new File("E:\\Myfile2.txt");  //import file using fileclass
	RandomAccessFile raf=new RandomAccessFile(f,"rw"); //import randomaccessfile to read from anywhere in file
  
    // Set the pointer at the last of the file
    raf.seek(10);  //seek method which get pointers at any particular position
    
    for(int i=10; i>=0;i--)  //for loop to print last chars from file
    {
    	System.out.print((char)raf.read());  //sop to read chars
    }
	raf.close(); //close the randomaccessfile
	}

}
