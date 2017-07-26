/**
 * Created by katkhedd on 7/25/2017.
 */
import java.util.*;
public class CarIdComparator implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        if(car1.id == car2.id)
            return 0;
        else if(car1.id > car2.id){
            return 1;
        }
        return -1;
    }
}
