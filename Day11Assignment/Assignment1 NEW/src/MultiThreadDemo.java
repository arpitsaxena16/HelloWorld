import org.junit.Test;

/**
 * Created by katkhedd on 7/31/2017.
 * Write a program using threads, one thread will increase the value
 of valiable i and other thread will diaplay this value.

 Do this exercise using 2 workers and 2 tasks namely
 ValueTask and PrintTask.

 And run the same program around 20 times and observe the result.

 */
public class MultiThreadDemo{
    int i =0;

    @Test
            public void testData(){
        int j = 0;

        while( j < 20){
        Thread thread1 = new Thread(()->i++);
        thread1.start();
        Thread thread2 = new Thread(()-> System.out.println(i));
        thread2.start();
        j++;
    }


}}
