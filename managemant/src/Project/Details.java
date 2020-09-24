package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Details extends Students{
	
	public static void details() throws IOException, ClassNotFoundException { 
	   String rollNumber;
	   boolean flag = false;
	   Scanner sc = new Scanner(System.in);
	   
	   
	   List<Students> list;

	   FileInputStream fis;
		ObjectInputStream is;
		FileOutputStream fos;
		ObjectOutputStream os;
		
	   fis = new FileInputStream("StudentInfo.txt");
		is = new ObjectInputStream(fis);			
		list = (ArrayList<Students>)is.readObject();
	     for(Students obj1 : list){
          System.out.println("Student Details");
          System.out.println();
          System.out.println("Name : "+obj1.getName());
          System.out.println("RollNumber : "+obj1.getRollNumber());
          System.out.println("Year : "+obj1.getYear());
          System.out.println("Department : "+obj1.getBranch());
          System.out.println("Section : "+obj1.getSection());
          System.out.println("E-mail : "+obj1.getEmail());
          System.out.println();
          flag = true;
       
          }
	}
}
