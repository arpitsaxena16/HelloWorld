package MyAccount;
import services.CustomerService;

public class Customer extends CustomerService {

		
	int accNo;
	String name;
	
	
	
	public Customer (int accNo, String name,int balance, String branch) {
		super(balance, branch);
		this.accNo = accNo;
		this.name = name;
	}
	
	public void makeCredit() { 
	
		credit();
	}
	public void makePayment() {
		
		payment();
	}
	public void makeTransfer() { 
	
		transfer();
	}
	
	public void display() {
		super.display();
		System.out.println("Account no. : " + accNo);
		System.out.println("Name : " + name);
	}
		
}