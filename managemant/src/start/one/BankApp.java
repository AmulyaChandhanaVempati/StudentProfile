package start.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankApp {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int choice,id;
		String name;
		double amount;
		double amount1;
		boolean flag = false;
		//Customer customers[] = new Customer[10]; 
		List<Customer> list = new ArrayList<Customer>();
		int index = -1;

		do {
			System.out.println("1. Add Customer");
			System.out.println("2. Display All Customers");
			System.out.println("3. Display Customer By Id");
			System.out.println("4. Deposit");
			System.out.println("5. Withdraw");
			System.out.println("6. Transfers");
			System.out.println("7. E X I T");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :  System.out.println("Enter Name :");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter amount :");
			amount = sc.nextDouble();
			Customer customer = new Customer(name,amount);
			list.add(customer);
			System.out.println("Customer added successfully and Id is:" + customer.getId());
			break;	
			case 2 : for(Customer obj : list){
				System.out.println(obj);
			}
			break;
			case 3: System.out.println("Enter id to display :");
			       id = sc.nextInt();
			       for(Customer obj1 : list){
			    	   if(obj1.getId() == id) {
			    		   System.out.println("Id :"+ obj1.getId());
							System.out.println("Name :"+ obj1.getName());
							System.out.println("Balance:"+ obj1.getBalance());
							flag = true;
							break;
			    	   }
			       }
			       if(flag == false)
			    	   System.out.println("Not found");
			       
			
			break;
			case 4:System.out.println("enter id: ");
			       id =sc.nextInt();
			       for( Customer obj2 : list){
			    	   if((obj2.getId()) == id){
			    		   flag =true;
			    		   if(flag ==true){
					    	   System.out.println("enter amount to be deposited:");
					    	   amount1 = sc.nextDouble();
				               obj2.setBalance(amount1+obj2.getBalance());
				               System.out.println("Total amount: "+obj2.getBalance());
				               
					       }
			    		   
			    	   }
			       
			      
			       else{
			    	   System.out.println("not found");
			       }
			       }
			       break;
			case 5:System.out.println("enter id: ");
		       id =sc.nextInt();
		       int j;
		       
		       for(Customer obj3 : list){
		    	   if(obj3.getId() == id){
		    		   flag =true;
		    		   if(flag ==true){
				    	   if((obj3.getBalance())>1000){
				    	    System.out.println("enter amount to be withdraw:");
				    	    amount1 = sc.nextDouble();
				    	     if((obj3.getBalance() -amount1) >=1000){
			                  obj3.setBalance(obj3.getBalance()-amount1);
			                  System.out.println("Total amount: "+obj3.getBalance());
				    	     }
				    	     else{
				    	    	 System.out.println("amount not sufficient"); 
				    	    	 
				    	     }
				    	   }
		    		   
		    	       }
		            }
		    	   else{
		     
		               System.out.println("id not found");
		    	   }
		    	
		    }
		       break;
		case 6:System.out.println("enter id: ");
		       id =sc.nextInt();
		       int k;
		       for(Customer obj4 : list){
		    	   if(obj4.getId() == id){
		    		   flag =true;
		    		   break;
		    	   }
		    	   
		       }
		       if(flag ==true){
		    	   System.out.println("enter id: ");
			       id =sc.nextInt();
			       int m;
			     
			       for( Customer obj5 : list){
			    	   if(obj5.getId() == id){
			    		   flag =true;
			    		  
			    	   
			       
			    	  
		    	   if((obj5.getBalance())>1000){
		    		   if(flag == true){	     
		    	     System.out.println("enter amount to be transfer:");
		    	     double amount2 = sc.nextDouble();
		    	     if((obj5.getBalance()-amount2) >=1000){
		    	    	 obj5.setBalance(obj5.getBalance()-amount2);
			              
		    	    	 System.out.println("Total amount: "+obj5.getBalance());
			               
		    	     
		    	    	 obj5.setBalance(amount2+obj5.getBalance());
			               System.out.println("Total amount: "+obj5.getBalance());
			               
		    	     }
		    	     }
		    	    else{
		    	    	 System.out.println("amount not sufficient"); 
		    	    	 
		    	     }
		    	   }
		    	   else{
		    		   System.out.println("id not found");
		    	   }
		    	   }
				
		       }
		       }
			}
			       
			      
		}while(choice<7);
	

	}

}