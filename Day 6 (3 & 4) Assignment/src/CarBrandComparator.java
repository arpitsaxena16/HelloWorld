/**
 * Created by katkhedd on 7/25/2017.
 */
import java.util.*;
public class CarBrandComparator implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        return car1.brand.compareTo(car2.brand);
    }
}
