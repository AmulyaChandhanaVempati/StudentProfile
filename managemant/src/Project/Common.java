package Project;

public class Common {
	
	protected static String subject;
	static int marks;
	static int total = 0;
	
	
		
	public static int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public Common(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
	
