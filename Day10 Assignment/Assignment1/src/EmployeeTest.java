import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by katkhedd on 7/29/2017.
 * Create a class called Employee and create atleast 50 employees.
 Then only filter those who are getting more then 50000.00 and
 then calculate there tds as 10% and show the total of tds.

 Plus meet below requirements also :
 a) Average of all employee salaries per month
 b) Total salary paid to all per month
 c) Who is getting minimum salary
 d) Who is getting maximum salary
 e) How many employees are there in the company
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(22, "Dipali", 40000),
                new Employee(33, "Rani", 35000),
                new Employee(223, "Rajan", 70000),
                new Employee(12, "kamal", 56000),
                new Employee(56, "Mukta", 98000),
                new Employee(78, "Romit", 78000),
                new Employee(98, "Radha", 33000),
                new Employee(21, "Sam", 44000),
                new Employee(67, "Sandy", 55000),
                new Employee(84, "Priyal", 66000),
                new Employee(39, "Diksha", 68000)
        );
            /**
            * Arpit's Comments:
            * You added only some details, assignment asks for 50 employees atleast.
            */

        Double result = empList.stream()
                .filter((empList1) -> empList1.getSalary() > 50000)
                .map((empList1) -> empList1.getSalary() * 0.1)
                .reduce((num1, num2) -> num1 + num2).get();

        System.out.println("Total TDS : " + result);


        Double average = empList.stream()
                .map((empList1) -> empList1.getSalary())
                //.collect(Collectors.averagingDouble();
                .collect(Collectors.summingDouble((val) -> val/empList.size()));
        System.out.println("Average" + average);

        Double totalSal = empList.stream()
                .map((empList1) -> empList1.getSalary())
                .collect(Collectors.summingDouble((val) -> val));
        System.out.println("Total salary given : " + totalSal);

        System.out.println("Maximum : "+empList.stream()
                .max((e1,e2) -> ((int)(e1.getSalary() - e2.getSalary()))));

        System.out.println("Minimum : "+empList.stream()
                .min((e1,e2) -> ((int)(e1.getSalary() - e2.getSalary()))));

        System.out.println("Total employees : "+empList.stream().count());

    }
}
