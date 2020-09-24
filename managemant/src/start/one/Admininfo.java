package start.one;

public class Admininfo {
	private static String username;
	private static String password;
	public Admininfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public static String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
