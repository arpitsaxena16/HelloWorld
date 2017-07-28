import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by katkhedd on 7/27/2017.
 * Write a program which will read a file which contains
 a) movie name
 b) actors
 c) directors
 d) duration

 and display on console properly.


 */
public class Movie {


    public static void main(String[] args) {
        InputStream movie = null;
        try {
            movie = new FileInputStream("C:/Java Practice/All code/day7/movie.txt");
            int file = movie.read();
            while (file != -1) {
                System.out.print((char)file);
                file = movie.read();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                movie.close();
            } catch(IOException e) {
                e.printStackTrace();

            }
        }
    }
}
