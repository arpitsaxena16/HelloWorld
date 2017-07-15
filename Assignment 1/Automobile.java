/**
 * Created by katkhedd on 7/13/2017.
 */
public class Automobile {
    int vin;
    String model;
    int speed;
    private double price;


    Automobile (int vin, String model,int speed, double price)
    {
        this.vin = vin;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    void Accelerate() {
        System.out.println("General speed is 40 kmph");
        speed = 40;
        System.out.println("Speed = " + speed);
    }
    double getPrice() {
        return this.price;
    }
    Automobile() {

    }
    void display() {
        System.out.println("VIN  : " + this.vin);
        System.out.println("Model  : " + this.model);
        System.out.println("No of wheels  : " + this.speed);
        System.out.println("Price  : " + this.price);
    }


}
