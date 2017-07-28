import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by katkhedd on 7/27/2017.
 *
  Write a program which is holding string data(car names) in a
 hashset. This program will save data permanently in a file
 named as cars.txt before exiting.


 */
public class CarTest {


    public static void main(String[] args) {

        Set<Car> car = new HashSet<>();

        car.add(new Car("Swift/n"));
        car.add(new Car("Audi"));
        car.add(new Car("Toyota"));
        car.add(new Car("Maruti"));
        car.add(new Car("Nano"));


//        List <Car> carList = new ArrayList<>();
      //  carList.addAll(car);
        FileWriter carWrite = null;


        try {

            carWrite = new FileWriter("C:/Users/katkhedd/IdeaProjects/CarBrands.txt");
            Iterator<Car> itr1  = car.iterator();

            while(itr1.hasNext()){
                carWrite.write(itr1.next().brand);
                System.out.println("done");
            }


        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (carWrite != null)
                carWrite.close();
            } catch(IOException e) {
                e.printStackTrace();

            }
        }
    }
}
