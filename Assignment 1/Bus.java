/**
 * Created by katkhedd on 7/13/2017.
 */
public class Bus extends Automobile {
    int capacity;
    float length;
    int noOfWheels;

    Bus(int vin, String model,int speed, double price, int capacity, float length, int noOfWheels) {
        super(vin, model, speed, price);
        this.capacity = capacity;
        this.length = length;
        this.noOfWheels = noOfWheels;
    }

    void Accelerate() {
        System.out.println("Bus speed is slow");
        speed = speed + 10;
        System.out.println("Speed = " + speed);
    }

    void display() {
        super.display();
        System.out.println("Capacity : " + this.capacity);
        System.out.println("Length of Bus : " + this.length);
        System.out.println("No. of wheels : " + this.noOfWheels);
    }

    public static void main(String[] s) {
        Bus b1 = new Bus(12, "AX", 25, 600000, 60, 20, 6);
        b1.display();
        b1.Accelerate();
    }
}
