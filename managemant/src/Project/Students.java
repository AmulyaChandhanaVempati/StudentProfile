package Project;

import java.io.Serializable;

public class Students implements Serializable{
	private int id;
	private int year;	
	private String name;
	private String password = null;

	private String section;
	private String email;
	private String branch;
	private String rollNumber;

	static int counter = 1000;
	
	public Students() {
		super();
		this.id = counter++;

	}

	public Students(int year, String name, String password, String section, String email,
			String branch, String rollNumber) {
		super();
		this.id = counter++;
		this.year = year;
		this.name = name;
		this.password = password;

		this.section = section;
		this.email = email;
		this.branch = branch;
		this.rollNumber = rollNumber;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

	

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	

	@Override
	public String toString() {
		return "Students [year=" + year + ", name=" + name + ", password=" + password + ", section=" + section + ", email=" + email + ", branch=" + branch + ", rollNumber="
				+ rollNumber  + "]";
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	
}
