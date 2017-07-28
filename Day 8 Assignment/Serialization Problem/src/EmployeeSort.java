import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by katkhedd on 7/28/2017.

  Write a program which will hold 10-50 employees in an array list.
 Application will first find those employees who are getting salary
 more then 40000 per month and then will sort them.
 And application will save sorted ones in a file before quiting
 with full details except their salaries and the will retrieve
 them and display the details on console in sorted way only
 based on natural sorting decided by eid field.
 */
public class EmployeeSort {

    public static void main(String[] args) {


        List<Employee> emp = new ArrayList<>();
        List<Employee> empList = new ArrayList<>();

        emp.add(new Employee(122, "Ram", 45000, "R&D"));
        emp.add(new Employee(212, "Priya", 65000, "R&D"));
        emp.add(new Employee(232, "Kamal", 35000, "R&D"));
        emp.add(new Employee(562, "Prem", 25000, "R&D"));
        emp.add(new Employee(542, "Sanjay", 48000, "R&D"));
        emp.add(new Employee(782, "Ranjiv", 50000, "R&D"));
        emp.add(new Employee(32, "Rohit", 45000, "R&D"));
        emp.add(new Employee(652, "Sunil", 60000, "R&D"));
        emp.add(new Employee(892, "Dipali", 30000, "R&D"));
        emp.add(new Employee(980, "Diksha", 65000, "R&D"));
        emp.add(new Employee(145, "Akshay", 55000, "R&D"));
        emp.add(new Employee(192, "Sudesh", 20000, "R&D"));
        emp.add(new Employee(982, "Suraj", 90000, "R&D"));

        Iterator<Employee> itr = emp.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            if (e.salary > 40000) {
                empList.add(e);

            }
        }


        Collections.sort(empList, new SalaryComparator());
        Iterator<Employee> itr1 = empList.iterator();

        while (itr1.hasNext()) {
            Employee employee = itr1.next();
            System.out.println(employee.getEmpId()+"   " + employee.getName()+"   " + employee.getSalary()+"   " + employee.getDeptName());
        }

        Collections.sort(empList);
        FileOutputStream empWrite = null;
        FileInputStream empRead = null;
        ObjectOutputStream objWrite = null;
        ObjectInputStream objRead = null;
        try {

            empWrite = new FileOutputStream("C:/Users/katkhedd/IdeaProjects/empSort.txt");
            objWrite = new ObjectOutputStream(empWrite);

            Iterator<Employee> itr2 = empList.iterator();

            while (itr2.hasNext()) {
                Employee e = itr2.next();
                objWrite.writeObject(e);
                System.out.println("done");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (empWrite != null)
                    empWrite.close();
            } catch (IOException e) {
                e.printStackTrace();

            }


        }

        try {

            empRead = new FileInputStream("C:/Users/katkhedd/IdeaProjects/empSort.txt");
            objRead = new ObjectInputStream(empRead);


            //Iterator<Employee> itr3 = empList.iterator();

            while (objRead.available() != -1) {

                System.out.println(objRead.readObject());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {

                if (objRead != null)
                    objRead.close();
                if (empRead != null)
                    empRead.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}