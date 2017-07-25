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