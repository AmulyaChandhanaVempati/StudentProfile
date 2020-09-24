package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Common {
		public Admin(String subject, int marks) {
			super(subject, marks);
			
		}
		static Scanner sc = new Scanner(System.in);
	    static boolean flag;
	    static int NoOfSubjects;
	    static List<Common> list = new ArrayList<Common>();
		private static String subject;
	    
		public static void admin() {
		Admininfo admininfo = new Admininfo("nikhitha","nikki");
		System.out.println("enter the username");
		String name = sc.nextLine();
		int c;

		if(Admininfo.getUsername().equals(name)) {
			   System.out.println("enter the password");
			   String password = sc.nextLine();
			   if(Admininfo.getPassword().equals(password)) {
				   System.out.println("successfully logged in");
				   System.out.println("Updation of marks of a Student");
				   System.out.println("Enter RollNumber to display :");
	               String rollNumber = sc.next();
				   System.out.println("Enter number of Subjects");	
				      NoOfSubjects = sc.nextInt();
				      for(int i = 0; i< NoOfSubjects;i++) {
					    	System.out.println("Enter Subject :");
							sc.nextLine();
							subject = sc.nextLine();
							System.out.println("Enter marks :");
							marks = sc.nextInt();
							
							Common obj = new Common(subject,marks);
							obj.total = obj.total + marks;
							list.add(obj);
							
				      }
				      System.out.println("Total Marks Obtained : " + getTotal());
						System.out.println("Avg : " + (getTotal()/NoOfSubjects));
			   }
		}
	     else {
			 System.out.println("check the password and login again");
		 }
		}
}
	
