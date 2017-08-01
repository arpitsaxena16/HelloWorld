/**
 * Created by katkhedd on 7/25/2017.
 * Problem Statement : Write a class EmployeeService as follows :

 fields :
 empId:int
 name:String
 salary:double
 phone:String
 desig:String
 methods:
 all get/set pairs
 updateSalary()
 eligibleForPromotion()
 calculateTDS()
 changeProject()
 changeDesignation()

 TBD - Check whether this class breaks SRP if yes, then refactor
 this class among multiple classes with correct and meanigful
 names and move corresponding methods in the right classes.

 */
public class Test {

    public static void main(String[] args) {


        EmployeeService emp = new EmployeeService(122, "Dipali", 40000, "9830278722", "Graduate traniee G");

        /**
         * Arpit's Comments: 
         * 1) Please format properly, so many unnecessary blank lines. 
         */
        double newSalary = emp.updateSalary(emp.getSalary());
        System.out.println("New salary : " + newSalary);

        emp.eligibleForPromotion(emp.getDesig());

        System.out.println(emp.changeDesignation(emp.getDesig()));
        System.out.println("TDS = " + emp.calculateTDS(emp.getSalary()));
        emp.changeProject();

    }
}
