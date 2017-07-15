package services;
import services.BankService;
public class CustomerService extends BankService {

			
			String branch;
		
		public CustomerService(int balance, String branch){
		super(balance);
		this.branch = branch;
		}
		
		public void display() {
			super.display();
			System.out.println("Branch :" + branch);
		}
		
		public void create() {
			System.out.println("Account created");
			
		}
		
		public void update() {
			System.out.println("Information updated");
		}
		
		public void delete() {
			System.out.println("Account deleted");
		}
				
		
}
		
		