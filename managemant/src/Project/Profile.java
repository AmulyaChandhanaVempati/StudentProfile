package Project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Project.Fees1;

public class Profile extends StudentProfile {

	public static void profile() throws ClassNotFoundException, IOException {
		Scanner sc  = new Scanner(System.in);
		int choice1;
		String rollNumber;
		
		 loop : do {
                                  System.out.println("=======================");
                                  System.out.println("1.Fee report");
                                  System.out.println("2.Marks report");
                                  System.out.println("3.Student's details");
                                  System.out.println("4.Logout");
                                  System.out.println("=======================");
                                  System.out.println("Enter your choice :");
                                  choice1 = sc.nextInt();
                            	 
								switch(choice1) {
                            	  
                            	  case 1:System.out.println("FEEs REPORT :");
                            	         Fees1.fees();
                            	         break;
                            	  case 2:System.out.println("MARKS REPORT ");
                            	        Marksheet.marks();
                            	         break;
                            	  case 3:System.out.println("STUDENT'S DETAILS");
                            	         Scanner scan= new Scanner(System.in);
                          		         
									try {
										Details.details();
									} catch (ClassNotFoundException | IOException e) {
										
										e.printStackTrace();
									}
                                         break;
                            	  case 4:System.out.println("You have logged out!!");
                            		    break loop;
                            	   
								}
		 }while(choice1 <= 4);
	}
}