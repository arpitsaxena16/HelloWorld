/**
 * Created by katkhedd on 7/25/2017.
 */
public class Test {

    public static void main(String[] args) {


        EmployeeService emp = new EmployeeService(122, "Dipali", 40000, "9830278722", "Graduate traniee G");


        double newSalary = emp.updateSalary(emp.getSalary());
        System.out.println("New salary : " + newSalary);

        emp.eligibleForPromotion(emp.getDesig());

        System.out.println(emp.changeDesignation(emp.getDesig()));
        System.out.println("TDS = " + emp.calculateTDS(emp.getSalary()));
        emp.changeProject();

    }
}
