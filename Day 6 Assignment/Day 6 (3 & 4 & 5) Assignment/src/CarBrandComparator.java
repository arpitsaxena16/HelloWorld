/**
 * Created by katkhedd on 7/25/2017.
 */
import java.util.*;
/**
 * Arpit's Comments: 
 * 1) Avoid using wild card in improts
 */
public class CarBrandComparator implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        return car1.brand.compareTo(car2.brand);
    }
}
