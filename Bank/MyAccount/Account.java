package MyAccount;
import services.BankService;

public class Account extends BankService {

	
	String userId;
	int password;
	
	
	
	
	public Account (String userId, int password, int balance) {
		super(balance);
		this.userId = userId;
		this.password = password;
	}
	
	public void takeLoan() { 
		
		loan();
	}
	
	
	public void display() {
		super.display();
		System.out.println("userId : " + userId);
		System.out.println("password : " + password);
	}
		
}