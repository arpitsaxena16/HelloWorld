import java.io.Serializable;

/**
 * Created by katkhedd on 7/28/2017.
 */
public class Employee implements Comparable<Employee> , Serializable {

    int empId;
    String name;
    transient double salary;
    String deptName;

    public Employee(int empId, String name, double salary, String deptName) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
    }

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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public int compareTo(Employee o) {
              return (this.getEmpId()-o.getEmpId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

