/**
 * Created by katkhedd on 8/1/2017.
 * Write a program using java 5 concurrent  APIs to run tasks and it
 is not known the size of tasks in advance so they may increase
 or decrease also in future, accordingly you have to pick right
 thread pool to use.

 Every task has to do the sum of 1-500 numbers and print.

 
 */
import java.util.concurrent.*;
public class TaskPerformer {
        public static void main(String[] args){
            SumTask sum  = new SumTask();
            Executor executor =  Executors.newCachedThreadPool();
            for(int i=0;i<5000;i++){
                executor.execute(sum);
            }
        }
    }
    class SumTask implements Runnable{
        public void run(){
            int sum = 0;
            for(int i=1;i<=500;i++)
                sum = sum + i;
            System.out.println("SUM : "+sum);
        }
}
