package start.one;

public class Customer {
		private int id;
		private String name;
		double balance;
		
		static int counter = 1000;
		public Customer() {
			super();
			this.id = counter++;
		}
		public Customer(String name, double balance) {
			super();
			this.id = counter++;
			this.name = name;
			this.balance = balance;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
		}
		
	}





