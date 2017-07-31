import java.util.concurrent.BlockingQueue;

/**
 * Created by katkhedd on 7/31/2017.
 * Write a program using threads, one thread will increase the value
 of valiable i and other thread will diaplay this value.

 Do this exercise using 2 workers and 2 tasks namely
 ValueTask and PrintTask.

 And run the same program around 20 times and observe the result.

 */
public class Main {
    static int i = 0;
    public static void main(String[] args) {

        int j = 0;
        ValueTask value = new ValueTask();
        PrintTask print = new PrintTask();

        while (j < 20) {
            ValueWorker valueW = new ValueWorker(value);
            PrintWorker printW = new PrintWorker(print);

            valueW.start();
            printW.start();
            j++;
        }
    }
}
