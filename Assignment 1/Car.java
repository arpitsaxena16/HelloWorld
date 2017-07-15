/**
 * Created by katkhedd on 7/13/2017.
 */
public class Car extends Automobile {
    String color;
    int seats;


    Car(int vin, String model,int speed, double price, String color, int seats) {

        super(vin, model, speed, price);
        this.color = color;
        this.seats = seats;
    }


    void display() {
        super.display();
        System.out.println("Color : " + this.color );
        System.out.println("No. of Seats : " + this.seats);
    }
    void check() {

        System.out.println("You are in class Car");
    }


}
