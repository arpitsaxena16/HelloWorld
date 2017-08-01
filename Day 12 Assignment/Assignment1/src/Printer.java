import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by katkhedd on 8/1/2017.
 */
public class Printer implements  Runnable{

    LinkedBlockingQueue<Integer> list = null;

    public Printer(LinkedBlockingQueue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {

            try {
                System.out.println("Number is : " + list.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
