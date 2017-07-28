import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by katkhedd on 7/25/2017.
 * Problem Statement : Write a program which will hold salary of 10 employees
 and will calculate their hra(30%) of salary and display
 on console.

 */
public class EmployeeTest {
    public static void main(String[] args) {


        List<Employees> emp = new ArrayList<Employees>(10);
        List<Double> hra = new ArrayList<Double>(10);

        emp.add(new Employees(1,30000.00));
        emp.add(new Employees(2,40000.00));
        emp.add(new Employees(3,50000.00));
        emp.add(new Employees(4,60000.00));
        emp.add(new Employees(5,70000.00));
        emp.add(new Employees(6,80000.00));
        emp.add(new Employees(7,90000.00));
        emp.add(new Employees(8,35000.00));
        emp.add(new Employees(9,45000.00));
        emp.add(new Employees(11,55000.00));

        Iterator<Employees> itr = emp.iterator();

        while(itr.hasNext()) {
            Employees e = itr.next();
            hra.add(e.getSalary()*0.3);

        }
        Iterator<Double> hraItr = hra.iterator();
        while(hraItr.hasNext()) {
            System.out.println(hraItr.next());

        }
    }

}
