import java.util.Comparator;

/**
 * Created by katkhedd on 7/28/2017.
 */
public class SalaryComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {

         if(o1.getSalary() < o2.getSalary())
             return  1;
         else if (o1.getSalary() == o2.getSalary())
             return 0;
         return -1;

    }
}


