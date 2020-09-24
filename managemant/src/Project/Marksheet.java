package Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marksheet extends Common{
	

	public Marksheet(String subject, int marks) {
		super(subject, marks);
		
	}
	
	
	static List<Common> list = new ArrayList<Common>();
	@SuppressWarnings({ "unchecked", "resource" })
	public static void marks() throws ClassNotFoundException, IOException {
		
		 List<Students> list;

		   FileInputStream fis;
			ObjectInputStream is;
			FileOutputStream fos;
			ObjectOutputStream os;
			
		   fis = new FileInputStream("StudentInfo.txt");
			is = new ObjectInputStream(fis);			
			list = (ArrayList<Students>)is.readObject();
		    	
		    	for(Students obj1 : list){
		
				
		    		for(Students obj2 : list){
		    			
		    		}
		        
		    	
		    	}
		    	System.out.println("Total Marks Obtained : " + getTotal());
		    	System.out.println();
  }

		
	
}
