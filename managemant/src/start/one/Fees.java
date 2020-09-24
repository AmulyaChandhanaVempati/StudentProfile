package start.one;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.lang.*;
import java.util.List;
import java.util.Scanner;
public class Fees {
	
	int choice;
	int year;
	int choice1;
	String name;
	String password = null;
	String confirmPassword = null;
	String section;
	String email;
	String branch;
	String rollNumber;
	String crtPassword;
	boolean flag = false;
	boolean flag1 = false;
	Scanner scan = new Scanner(System.in);
	public Student readObject1(ObjectInputStream is) {
		Student object = null;
		try {
			object = (Student)is.readObject();
			return object;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return object;
	}
	@SuppressWarnings("unchecked")
	public boolean LogIn() {
		try {
			FileInputStream fis = new FileInputStream("Students.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			List<Student> list;
			
			list = (ArrayList<Student>)is.readObject();
			
			System.out.println("LogIn");
			System.out.println(" UserName :");
			scan.nextLine();
			name = scan.nextLine();
	      	  for(Student obj : list) {
	      		  if(obj.getName().equals(name)) {
	      			  flag = true;
	      			if(flag == true) {
		      			  System.out.println("enter the password");
		      			  password = scan.nextLine();
		      			  
		      			  if(obj.getPassword().contentEquals(password)) {
		      				  flag1 = true;		      				
		      			  }
		      			  else {
	      					  flag1 = false;
	      				      while(flag1 == false) {      				  
	      				  System.out.println("Wrong Password");
	      				  System.out.println("ReEnter Password");
	      				  crtPassword = scan.nextLine();
	      				  if(obj.getPassword().equals(crtPassword)) {
	    					 flag1 = true;
	    					 
	    					 loop: do {
	                             System.out.println("1. show attendance");
	                             System.out.println("2. fee report");
	                             System.out.println("3.show marks report");
	                             System.out.println("4.show Student's details");
	                             System.out.println("5.logout");
	                            System.out.println("enter your choice :");
	                            
	                       	  choice1 = scan.nextInt();
	                       	 
	    						switch(choice1) {
	                       	  case 1:System.out.println("This is for attendance");
	                       	     break;
	                       	  case 2:System.out.println("This is for fee report");
	                       	    int year2,ch;
	                       		int distance;
	                       		String choice2;
	                       		Scanner scan1 = new Scanner(System.in);
	                       		do {
	                       		System.out.println("MENU");
	                       		System.out.println("---------");
	                       		System.out.println("1.Fees");
	                       		System.out.println("2.Due Amount");
	                       		System.out.println("3.Exit");
	                       		
	                       		System.out.println();
	                       		System.out.print("Enter your choice : ");
	                       		ch = scan1.nextInt();
	                       		
	                       		
	                       		switch(ch) {
	                       		case 1:
	                       			int c;
	                       			System.out.println();
	                       			System.out.println("1.Tuition Fees");
	                       			System.out.println("2.Transport Fees");
	                       			System.out.println("3.Hostel Fees");
	                       			System.out.println("4.Exit");
	                       			System.out.println("Enter Your Choice : ");
	                       			c = scan1.nextInt();
	                       			switch(c) {
	                       			case 1:
	                       				   System.out.print("Enter year : ");
	                       			       year = scan1.nextInt();
	                       			       if(year == 1) {
	                       				        System.out.println("Tuition Fees to be paid = 86000");
	                       				    }
	                       				    if(year == 2) {
	                       					    System.out.println("Tuition Fees to be paid = 73500");
	                       				    }
	                       				    if(year == 3) {
	                       					    System.out.println("Tuition Fees to be paid = 69000");
	                       			     	}
	                       				    if(year == 4) {
	                       					    System.out.println("Tuition Fees to be paid = 68000");
	                       				    }
	                       				    break;
	                      			case 2:
	                      				   System.out.println("Enter Distance to check transport fees : ");
	                      			       distance = scan1.nextInt();
	                      			       if(distance >= 40) {
	                      				    	System.out.println("Transport Fees = 23000");
	                      				    }
	                      				    if(distance < 40) {
	                      				    	System.out.println("Transport Fees = 18000");
	                      				   }
	                      				   break;
	                      			case 3:
	                      				   System.out.println("Enter your Hostel option(ac/non-ac) : ");
	                      	               choice2 = scan1.next();
	                      	               if(choice2.equals("ac")) {
	                      	       	    	System.out.println("Hostel Fees = 110000");
	                      	       	       }
	                      	       	       if(choice2.equals("non-ac")) {
	                      	       	    	System.out.println("Hostel Fees = 93000");
	                      	       	       }
	                      	       	       break;
	                      			case 4:break loop;
	                      			}
	                      			break;
	                       		case 2:
	                       		   int amount;
	                       		   System.out.println("Enter Year : ");
	                       		   year = scan1.nextInt();
	                       		   System.out.println("Enter Roll Number : ");
	                       		   int Roll_number = scan1.nextInt();
	                       		   System.out.println("Amount Paid Previously : ");
	                       		   amount = scan1.nextInt();
	                       		   if(year == 1) {
	                       		      if(amount == 86000) {
	                       	            System.out.println("Fee cleared"); 
	                       	            System.out.println();
	                       	          }
	                       		      else {
	                       				   System.out.println("There is "+(86000-amount) + " Due");
	                       			   }
	                       			   break;
	                       		   }
	                       		   if(year == 2) {
	                       			   if(amount == 73500) {
	                       				   System.out.println("Fee Cleared");
	                       				   System.out.println();
	                       			   }
	                       			   else {
	                       				   System.out.println("There is "+(73500-amount) + " Due");
	                       			   }
	                       			   break;
	                       		   }
	                       		   if(year == 3) {
	                       			      if(amount == 69000) {
	                       		            System.out.println("Fee cleared"); 
	                       		            System.out.println();
	                       		          }
	                       			      else {
	                       					   System.out.println("There is "+(69000-amount) + " Due");
	                       				  }
	                       				  break;
	                       			   }
	                       		   if(year == 4) {
	                       				   if(amount == 68000) {
	                       					   System.out.println("Fee Cleared");
	                       					   System.out.println();
	                       				   }
	                       				   else {
	                       					   System.out.println("There is "+(68000-amount) + " Due");
	                       				   }
	                       				   break;
	                       		    }
	                       		    else {
	                       	           System.out.println("There is Due in the Fee");
	                       		       break;
	                       		   }
	                       	    case 3:break loop;
	                       		}
	                       	    
	                       		}while(ch <=3);
	                       	         break;
	                       		
	                       	  case 3:System.out.println("This is for marks report");
	                       	       break;
	                       	  case 4: 
	                       		      System.out.println("This is for student details");
	                       	          System.out.println("Enter RollNumber to display :");
	          			                  rollNumber = scan.next();
	          			                  for(Student obj1 : list){
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
	          							   break;
	          			    	         }
	          			               
	          			               if(flag == false)
	          			    	       System.out.println("Not found");
	          			               break;
	                       	  case 5:break loop;
	                       	  }
	                      }while(choice1<5);
	     		         }
	     				 break;	 
	         			}
		      			  }}
	      			
	     	          
	     		      else {
	     				  flag = false;
	     				if(flag == false) {
	     	      		  System.out.println("no such user found");
	     	      	      }
	     	          }
	    			  }
	    				  }
	      	  
		
	      				  if(flag1 == true) {
	      					  return true;
	      				  }
			
			is.close();
			fis.close();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}

		return false;
	}
	
		
	
	
	
	
	
	
	
	public void mainMenu() {
		Fees fees = new Fees();
		int choice = 0;
				
		System.out.println("==================");
		System.out.println("1. student LogIn");
		System.out.println("2. student Register");
        System.out.println("3. Admin login");
		System.out.println("4.exit ");
		System.out.println("==================");
		System.out.println("Enter your choice :");
		choice = scan.nextInt();
		System.out.println();
			
		if(choice == 1) {
			if(fees.LogIn()) {
				
 
			}
			else {
				System.out.println("Login Failed!!!\n");
				mainMenu();
			}
		}
		else if(choice == 2) {
			fees.register();	
			mainMenu();
		}	
		else if(choice == 4) {
			System.out.println("Application Terminated!!! \n");
		}
		else {
			mainMenu();
		}
	}
	
	private void register() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Fees obj = new Fees();
		obj.mainMenu();
	}
}


	
	
	
  
	      	  


	/*public static Student main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int choice;
		int year;
		int choice1;
		String name;
		String password = null;
		String confirmPassword = null;
		String section;
		String email;
		String branch;
		String rollNumber;
		String crtPassword;
		List<Student> list = new ArrayList<Student>();
		boolean flag = false;
		boolean flag1 = false;
		Student readObject1 (ObjectInputStream is ){
			Student object = null;
			try {
				object = (Student)is.readObject();
				return object;
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			return object;
		}
		
		do {
			
			
			switch(choice) {
			
			case 2: System.out.println("Registration");
			System.out.println(" UserName :");
			scan.nextLine();
			name = scan.nextLine();
			System.out.println(" Password (String type):");
			password = scan.nextLine();
			System.out.println(" ConfirmPassword (String type):");
			confirmPassword = scan.nextLine();
			if(password.equals(confirmPassword)){
				flag = true;
			}
			else {
				flag = false;
			while(flag == false) {
				System.out.println("Password doesn't match!");
				System.out.println("ReEnter Password");
				confirmPassword = scan.nextLine();
				if(password.equals(confirmPassword)) {
					flag = true;
				}
			}
			}
			if(flag == true) {
					System.out.println(" Year :");
					year = scan.nextInt();
					System.out.println(" RollNumber :");
					scan.nextLine();
					rollNumber = scan.nextLine();
					System.out.println(" Section :");
				    section = scan.nextLine();
					System.out.println(" Email :");
					email = scan.nextLine();
					System.out.println(" Branch :");
					branch = scan.nextLine();
					Student student = new Student(year,name,password,section, email,
							branch, rollNumber);
					list.add(student);
					System.out.println("Student has Registered successfully !");
			   }
			
					break;
			case 3:Admininfo admininfo = new Admininfo("nikhitha","nikki");
				System.out.println("enter the username");
				   scan.nextLine();
			       name = scan.nextLine();
			       if(Admininfo.getUsername().equals(name)) {
			    	   System.out.println("enter the password");
			    	   password = scan.nextLine();
			    	   if(Admininfo.getPassword().equals(password)) {
			    		   System.out.println("successfully logged in");
			    	   }
			    	   else {
			    		   System.out.println("check the password and login again");
			    	   }
			       }
			       else {
			    	   System.out.println("no such user found");
			       }
			       
			}
			System.out.println("hello");
		}while(choice < 4);
		
	}
}*/
			

	


