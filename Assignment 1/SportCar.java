/**
 * Created by katkhedd on 7/13/2017.
 */
public class SportCar extends Car {
    float maxSpeed;
    float sizeOfWheel;
    String layoutType;

   SportCar(int vin, String model,int speed, double price, String color, int seats, float maxSpeed, float sizeOfWheel, String layout)
    {
        super(vin, model, speed, price, color, seats);
        this.maxSpeed = maxSpeed;
        this.sizeOfWheel = sizeOfWheel;
        this.layoutType = layoutType;
    }

    void display() {
        super.display();
        System.out.println("max speed : " + this.maxSpeed);
        System.out.println("size of wheel : " + this.sizeOfWheel);
        System.out.println("layout type : " + this.layoutType);
    }
}
