package Project;

import java.util.Scanner;
public class Fees1 extends Students{
    private static int year;
	private static int ch,c;
	private static int distance;
	static String choice2,Roll_number;
	static boolean flag;
	public static void fees() {
	Scanner scan = new Scanner(System.in);
	loop : do {
	      System.out.println("MENU");
	      System.out.println("---------");
	      System.out.println("1.Fees");
	      System.out.println("2.Due Amount");
	      System.out.println("3.Exit");
	      System.out.print("Enter your choice : ");
	      ch = scan.nextInt();
	switch(ch) {
	case 1:
		int c;
		System.out.println();
		System.out.println("1.Tuition Fees");
		System.out.println("2.Transport Fees");
		System.out.println("3.Hostel Fees");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice : ");
		c = scan.nextInt();
		switch(c) {
		case 1:
			   System.out.print("Enter year : ");
		       year = scan.nextInt();
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
		       distance = scan.nextInt();
		       if(distance >= 40) {
			    	System.out.println("Transport Fees = 23000");
			    }
			    if(distance < 40) {
			    	System.out.println("Transport Fees = 18000");
			   }
			   break;
		case 3:
			   System.out.println("Enter your Hostel option(ac/non-ac) : ");
               choice2 = scan.next();
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
	   year = scan.nextInt();
	   System.out.println("Enter Roll Number : ");
	   scan.nextLine();
	   Roll_number = scan.nextLine();
	   System.out.println("Amount Paid Previously : ");
	   amount = scan.nextInt();
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
			   System.out.println("Fee cleared");
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
				   System.out.println("Fee cleared");
				   System.out.println();
			   }
			   else {
				   System.out.println("There is "+(68000-amount) + " Due");
			   }
			   break;
	    }
	    else {
	       break;
	   }
   
    case 3:break loop;
    }
		
	}while(ch <=3);
	   
    }
}
	   

