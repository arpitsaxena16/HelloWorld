import java.util.concurrent.BlockingQueue;

/**
 * Created by katkhedd on 7/31/2017.
 */
public class ValueWorker extends Thread {
    ValueTask valueTask;

    public ValueWorker(ValueTask valueTask) {
        this.valueTask = valueTask;
    }


    public void run(){

          {
            valueTask.run();

        }
    }
}
