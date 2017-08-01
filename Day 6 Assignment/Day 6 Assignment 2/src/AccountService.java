/**
 * Arpit's Comments: 
 * 1) Please format the code properly, make it a habit to format as you code, also add some description to methods, as soon as you create them.
 */
public class AccountService {
    public AccountService() {
    }

    public double updateSalary(double salary) {
        double newSalary = salary + 5000;

        System.out.println("Salary updated");
        return newSalary;
    }

    public double calculateTDS(double salary) {
        double TDS = salary * 5 / 100;
        return TDS;

    }
}
