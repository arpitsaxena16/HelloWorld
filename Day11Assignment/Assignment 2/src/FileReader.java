/**
 * Created by katkhedd on 7/31/2017.
 * Write a program so that you can read 2 different files
 concurrently and print result on console.
 */
public class FileReader extends Thread{
    public static void main(String[] args) {


        FirstFile task1 = new FirstFile();
        SecondFile task2 = new SecondFile();

        Thread thread1 = new Thread(task1);

        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
