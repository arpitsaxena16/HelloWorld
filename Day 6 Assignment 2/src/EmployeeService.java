/**
 * Created by katkhedd on 7/25/2017.
 */
public class EmployeeService {

    private final AccountService accountService = new AccountService();
    private final Manager manager = new Manager();
    private final HRServices HRServices = new HRServices();
    private int empId;
    private String name;
    private double salary;
    private String phone;
    private String desig;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public EmployeeService(int empId, String name, double salary, String phone, String desig) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.desig = desig;
    }

    public double updateSalary(double salary) {

        return accountService.updateSalary(salary);
    }
    public void eligibleForPromotion(String Perfect) {
        HRServices.eligibleForPromotion(Perfect);
    }
    public  double calculateTDS(double salary) {

        return accountService.calculateTDS(salary);
    }
    public  String changeProject() {
        return manager.changeProject();
    }
    public String changeDesignation(String desig) {

        return HRServices.changeDesignation(desig);
    }


}
