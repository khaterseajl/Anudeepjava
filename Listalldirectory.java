import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Listalldirectory { //main class

	public static void main(String[] args) throws IOException {//main method
		
		File f=new File("D:\\SEJAL Study FOLDER"); //import file name or folder name in which u want to perfom operations
	           
       System.out.println("file is writable: "+f.canWrite()); //canwrite returns true or false if it is written it will return true else false
       System.out.println("file is readable: "+f.canRead()); //canread enables file in reading mode
	   System.out.println("file length is: "+f.length()); //it returns length of that particular file
		System.out.println("File can execute:"+ f.canExecute()); // canexecute method
		System.out.println("to get file path of all files:"+ f.list());   //list method will return all the file paths of that file
		
		String[] fileList=f.list(); //string decalred to get list of files
	       for(String name:fileList){ //for each loop to print all filelist
	           System.out.println(name); //print the name 
       
	       }
}
}