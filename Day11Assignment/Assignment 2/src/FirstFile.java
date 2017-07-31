import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by katkhedd on 7/31/2017.
 */
public class FirstFile implements  Runnable {
    @Override
    public void run() {

        InputStream file1 = null;
        try {
            file1 = new FileInputStream("C:/Users/katkhedd/IdeaProjects/File1.txt");
            int file = file1.read();
            while (file != -1) {
                System.out.print((char)file);
                file = file1.read();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file1.close();
            } catch(IOException e) {
                e.printStackTrace();

            }
        }
    }
}
