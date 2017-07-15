/**
 * Created by katkhedd on 7/14/2017.
 */
public class MainClass {
    public static void main(String[] s) {
        FlyingCar c1 = new FlyingCar(33, "cds", 30, 1000000, "white", 4, 4, 250);
        c1.display();
        c1.check();
        c1.Accelerate();
        System.out.println("Price is : " + c1.getPrice() );

        Bus b1 = new Bus(12, "AX", 25, 600000, 60, 20, 6);
        b1.display();
        b1.Accelerate();
        System.out.println("Price is : " + b1.getPrice() );

    }
}
