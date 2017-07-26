
import java.util.*;
/**
 * Created by katkhedd on 7/25/2017.
 */
public class CarTest {

    public static void main(String[] args) {



        CarBrandComparator brandComparator = new CarBrandComparator();
        CarIdComparator idComparator = new CarIdComparator();

        System.out.println("Default sorting by price");
        Set<Car> car1 = new TreeSet<>();
        createData(car1);
        printData(car1);

        System.out.println("sorting by Brand names");
        Set<Car> car2 = new TreeSet<>(brandComparator);
        createData(car2);
        printData(car2);

        System.out.println("sorting by Id");
        Set<Car> car3 = new TreeSet<>(idComparator);
        createData(car3);
        printData(car3);

    }

    public static void createData(Set<Car> car) {
        car.add(new Car(112, "Lamborghini", 8000000));
        car.add(new Car(22, "Swift", 1000000));
        car.add(new Car(12, "SwiftDesire", 1200000));
        car.add(new Car(9, "Alto", 500000));
        car.add(new Car(2, "Maruti", 4500000));
        car.add(new Car(56, "Nano", 100000));
        car.add(new Car(42, "Audi", 7000000));
        car.add(new Car(89, "Maruti Suzuki", 800000));
        car.add(new Car(678, "Toyota", 1400000));
        car.add(new Car(789, "Tata", 1500000));
        car.add(new Car(33, "Santro", 700000));
        car.add(new Car(92, "Wagenaor", 600000));
        car.add(new Car(155, "Scorpio", 2000000));
        car.add(new Car(345, "Acura", 8000000));
        car.add(new Car(204, "BMW", 4550000));
        car.add(new Car(438, "Bugatti", 6700000));
        car.add(new Car(834, "Porshce", 5500000));
        car.add(new Car(398, "Volkswagen", 500000));
        car.add(new Car(5689, "Volvo", 900000));
        car.add(new Car(76, "Tesla", 2200000));
        car.add(new Car(99, "Chevrolet", 700000));
        car.add(new Car(16, "Alfa", 1000000));
        car.add(new Car(923, "Citroen", 7700000));
        car.add(new Car(2938, "Ferrari", 4300000));
        car.add(new Car(23, "Ford", 2700000));

    }

    public static void printData(Set<Car> car) {
        Iterator<Car> itr = car.iterator();

        while (itr.hasNext()) {
            Car c = itr.next();
            System.out.println("Id : " + c.getId() + "   Brand : " + c.getBrand() + "   Price : " + c.getPrice());
        }
    }
}



