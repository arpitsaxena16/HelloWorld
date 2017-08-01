import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by katkhedd on 8/1/2017.
 * Write a program using concurrent APIs so that one thread can
 produce some random integer data and other thread can read it
 from the same collection and display it on the console.

 */
public class ConcurrentDemo {

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> list =  new LinkedBlockingQueue<>();

        RandomGenerator randomNum = new RandomGenerator(list);
        Printer numPrint = new Printer(list);

        Thread thread1 = new Thread(randomNum);
        Thread thread2 = new Thread(numPrint);

        thread1.start();
        thread2.start();


    }
}
