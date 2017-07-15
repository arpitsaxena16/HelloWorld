package client;
import MyAccount.Customer;
import MyAccount.Account;
public class Client{

	public static void main(String[] s) {
		Customer customer = new Customer(357882, "Ram", 10000, "pune");
		Account account = new Account("CDK", 12345, 60000);
		customer.display();
		customer.create();
		customer.update();
		
		account.takeLoan();
		customer.makeCredit();
		customer.makePayment();
		customer.makeTransfer();
		
	}
}