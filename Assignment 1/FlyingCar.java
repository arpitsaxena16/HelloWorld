/**
 * Created by katkhedd on 7/13/2017.
 */
public class FlyingCar extends Car {
    int noOfWheels;
    double weight;

    FlyingCar(int vin, String model,int speed, double price, String color, int seats, int noOfWheels, double weight)
    {
        super(vin, model, speed, price, color, seats);
        this.noOfWheels = noOfWheels;
        this.weight = weight;
    }
    void Accelerate() {
        System.out.println("Flying car speed is very high");
        speed = speed + 120;
        System.out.println("Speed = " + speed);
    }

    void display() {
        super.display();
        System.out.println("No. of wheels : " + this.noOfWheels);
        System.out.println(" Weight : " + this.weight);

    }
    public static void main(String[] s) {
        FlyingCar c1 = new FlyingCar(33, "cds", 30, 1000000, "white", 4, 4, 250);
        c1.display();
        c1.check();
        c1.Accelerate();
        //System.out.println("Price is : " + getPrice() );
    }
}
