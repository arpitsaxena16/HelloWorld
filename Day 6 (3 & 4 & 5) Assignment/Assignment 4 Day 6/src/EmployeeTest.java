import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by katkhedd on 7/25/2017.
 * Problem Statement : Write a program which will hold salary of 10 employees
 and will increase(by 20%) of those employees where salary
 is less then 20000.00
 */
public class EmployeeTest {
    public static void main(String[] args) {


        List<Employees> emp = new ArrayList<Employees>(10);


        emp.add(new Employees(1, 30000.00));
        emp.add(new Employees(2, 40000.00));
        emp.add(new Employees(3, 50000.00));
        emp.add(new Employees(4, 15000.00));
        emp.add(new Employees(5, 10000.00));
        emp.add(new Employees(6, 80000.00));
        emp.add(new Employees(7, 18000.00));
        emp.add(new Employees(8, 35000.00));
        emp.add(new Employees(9, 15000.00));
        emp.add(new Employees(11, 55000.00));

        Iterator<Employees> itr = emp.iterator();

        while (itr.hasNext()) {
            Employees e = itr.next();
            if(e.getSalary() < 20000) {
                e.setSalary(e.getSalary()+(e.getSalary()*0.20));

            };

        }
        Iterator<Employees> e = emp.iterator();
        while(e.hasNext()) {
            Employees empl = e.next();
            double sal = empl.getSalary() ;
            int id = empl.getId();
            System.out.println("Id : " + id + "  Salary = " + sal);

        }


    }
}
