package Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentProfile extends Students {
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
	List<Students> list;


	Scanner scan = new Scanner(System.in);
	public Students readObject1(ObjectInputStream is) {
		Students object = null;
		try {
			object = (Students)is.readObject();
			return object;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return object;
	}
	@SuppressWarnings("unchecked")
	public boolean login() {
		
		try {
			FileInputStream fis = new FileInputStream("StudentInfo.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			
			
			list = (ArrayList<Students>)is.readObject();
			System.out.println("LogIn");
			System.out.println(" UserName :");
			name = scan.nextLine();
			System.out.println("enter the password");
			 password = scan.nextLine();
	      	  for(Students obj : list) {
	      		  if(obj.getName().equals(name)&& obj.getPassword().contentEquals(password)) {
	      			  return true;
	      			  
	      		  }
	      	  }		      	
			
			is.close();
			fis.close();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
			password = scan.nextLine();
			System.out.println("ConfirmPassword :");
			confirmPassword = scan.nextLine();
			if(password.equals(confirmPassword)){
				flag = true;
			}
		return false;		
	}
	
	
	public void register() {	
		List<Students> list = new ArrayList<Students>();
		System.out.println("Registration");
		System.out.println(" UserName :");
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
				Students student = new Students(year,name,password,section, email,
						branch, rollNumber);
				list.add(student);
				System.out.println("Student has Registered successfully !!!");
		FileInputStream fis;
		ObjectInputStream is;
		FileOutputStream fos;
		ObjectOutputStream os;
		
		try {			
			fis = new FileInputStream("StudentInfo.txt");
			is = new ObjectInputStream(fis);			
			list = (ArrayList<Students>)is.readObject();	
			is.close();
			fis.close();
		}
		catch (Exception e) { 
			
		}
		
		try {
			fos = new FileOutputStream("StudentInfo.txt");
			os = new ObjectOutputStream(fos);
			
			list.add(student);
			os.writeObject(list);
			os.close();
			fos.close();
		}
		catch (Exception ex) {			
		}
		
	
	
		}
	}
	
	public void mainMenu() throws ClassNotFoundException, IOException {
		StudentProfile sf = new StudentProfile();
		int choice = 0;
				
		System.out.println("STUDENT PROFILE :");
		System.out.println("========================");
			
		System.out.println("1. Student Login");
		System.out.println("2. Student Register");
		System.out.println("3. Admin Login");
		System.out.println("4. Exit \n");
		 System.out.println("=======================");
			
		System.out.print("Enter Your Choice : ");
		choice = scan.nextInt();
		System.out.println();
			
		if(choice == 1) {
			if(sf.login()) {
				System.out.println("Successfully Logined \n");
				Profile.profile();
				mainMenu();
				
			}
			else {
				System.out.println("Login Failed!!!\n");
				mainMenu();
			}
		}
		else if(choice == 2) {
			sf.register();	
			mainMenu();
		}	
		else if (choice == 3) {
			    Admin.admin();
		        mainMenu();
		}

		 
		else if(choice == 4) {
			System.out.println("Application Terminated!!! \n");
		}
		else {
			mainMenu();
		}
	}
	

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		StudentProfile obj = new StudentProfile();
		obj.mainMenu();
		
	}
	

	

}

