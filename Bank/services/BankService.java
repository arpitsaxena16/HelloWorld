package services;
public class BankService {

		
		protected int balance;
		
		public BankService(int balance) {
			this.balance = balance;
			
		}
		
		
		
		public void display() {
			System.out.println("Balance : " + balance);
		}
		protected void credit() {
			System.out.println("Account is credited");
		}
		
		protected void payment() {
			System.out.println("Payment is done");
		}
		
		protected void transfer() {
			System.out.println("Money transfered");
		}

		public void loan() {
			System.out.println("Loan in allowed");
		}


}