package files;


	import java.io.DataOutputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Customer implements Serializable{
		private String userId;
		private String password;
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}		
	}

	public class Login {
		Scanner scan = new Scanner(System.in);
		
		public Customer readObject1(ObjectInputStream is) {
			Customer object = null;
			try {
				object = (Customer)is.readObject();
				return object;
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			return object;
		}
		
		@SuppressWarnings("unchecked")
		public boolean signIn() {
			try {
				FileInputStream fis = new FileInputStream("Customers.txt");
				ObjectInputStream is = new ObjectInputStream(fis);
				List<Customer> list;
				
				list = (ArrayList<Customer>)is.readObject();
				int i = 1;
				
				System.out.print("Enter User ID  : ");
				String userId = scan.next();
				System.out.print("Enter Password : ");		
				String password = scan.next();
				
				for(Customer customer : list) {
					if(customer.getUserId().equals(userId) && customer.getPassword().equals(password)) {
						return true;
					}
				}
				
				is.close();
				fis.close();
			}
			catch (Exception ex) {
				System.out.println(ex);
			}
			
			return false;
		}
		
		@SuppressWarnings("unchecked")
		public void register() {	
			List<Customer> list = new ArrayList<Customer>();
			
			Customer customer = new Customer();
			System.out.print("Enter User ID  : ");
			customer.setUserId(scan.next());
			System.out.print("Enter Password : ");		
			customer.setPassword(scan.next());
			
			FileInputStream fis;
			ObjectInputStream is;
			FileOutputStream fos;
			ObjectOutputStream os;
			
			try {			
				fis = new FileInputStream("Customers.txt");
				is = new ObjectInputStream(fis);			
				list = (ArrayList<Customer>)is.readObject();	
				is.close();
				fis.close();
			}
			catch (Exception e) { 
				
			}
			
			try {
				fos = new FileOutputStream("Customers.txt");
				os = new ObjectOutputStream(fos);
				
				list.add(customer);
				os.writeObject(list);
				os.close();
				fos.close();
			}
			catch (Exception ex) {			
			}
			
			System.out.println("Customer Registered Successfully!!! \n");
		}
		
		public void mainMenu() {
			Login login = new Login();
			int choice = 0;
					
			System.out.println("Select Your Choice");
			System.out.println("==================");
				
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Exit \n");
				
			System.out.print("Enter Your Choice : ");
			choice = scan.nextInt();
			System.out.println();
				
			if(choice == 1) {
				if(login.signIn()) {
					System.out.println("Successfully SignIn \n");
					
					//Write your project code
					
				}
				else {
					System.out.println("Login Failed!!!\n");
					mainMenu();
				}
			}
			else if(choice == 2) {
				login.register();	
				mainMenu();
			}	
			else if(choice == 3) {
				System.out.println("Application Terminated!!! \n");
			}
			else {
				mainMenu();
			}
		}
		
		public static void main(String[] args) {
			Login obj = new Login();
			obj.mainMenu();
		}
	}







