import java.util.concurrent.BlockingQueue;

/**
 * Created by katkhedd on 7/31/2017.
 */
public class PrintWorker extends  Thread {
    PrintTask printTask;
    public PrintWorker(PrintTask printTask) {
        this.printTask = printTask;
    }

    public void run(){
        {
            printTask.run();
         }
    }
}
