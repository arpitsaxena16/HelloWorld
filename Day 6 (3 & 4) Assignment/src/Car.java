/**
 * Created by katkhedd on 7/25/2017.
 */
public class Car implements Comparable<Car> {
    int id;
    String brand;
    double price;

    public Car(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Car car){
        if(this.price == car.price)
            return 0;
        else if(this.price < car.price){
            return 1;
        }
        return -1;
    }
}
