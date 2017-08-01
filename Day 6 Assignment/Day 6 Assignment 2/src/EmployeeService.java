/**
 * Arpit's Comments: 
 * 1) There are not commnets on methods, all methods other than getters and setters should have comments on them to explain the functionality.
 */
/**
 * Created by katkhedd on 7/25/2017.
 */
public class EmployeeService {

    private final AccountService accountService = new AccountService();
    private final Manager manager = new Manager();
    /**
     * Arpit's Comments: 
     * 1) Variables should be in camel case, HRServices is not a proper variable name - find out what better name you can give here. I think hrServices will be better.
     */
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

    /**
    * Arpit's Comments: 
    * 1) The constructor should be placed before getters and setters. (Just a good practice)
    * 2) Formatting should be done along with the coding, I can see many blank lines in methods.
    */
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
        /**
        * Arpit's Comments: 
        * 1) Method parameters should be in camel case.
        * 2) Why this method is not reurning anything? Shouldn't it be returning a boolean value?
        */
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
