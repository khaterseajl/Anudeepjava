import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*Write a Java program to get a list of all file/directory names 
 * from the given string.*/
public class Listalldirectory { //main class
 static File f=new File("D:\\\\SEJAL Study FOLDER"); //import file name or folder name in which u want to perfom operations
	public static void main(String[] args) throws IOException {//main method
	
	}
	
		public static void displaylist() throws IOException
		{
			 File f1[]=f.listFiles(); //instantiate file object with listfile method
			
			for(File f:f1)  //for loop
				
			{

      System.out.println(f);	//print filename
      System.out.println("file is writable: "+f.canWrite());//canwrite returns true or false if it is written it will return true else false
      System.out.println("file is readable: "+f.canRead()); //canread enables file in reading mode
      System.out.println("file length is: "+f.length()); //it returns length of that particular file
      System.out.println("File can execute:"+ f.canExecute()); // canexecute method
      System.out.println("to get file path of all files:"+ f.list());   //list method will return all the file paths of that file
			}

		}
		public static void writeFile()throws IOException
		{
			FileWriter fw=new FileWriter(f); //create file which writes into file
			fw.write("javaa"); //write into file
			fw.close(); //close the file
    }

}