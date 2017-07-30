import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by katkhedd on 7/28/2017.
 */
public class ArrayManipulation {
    static Integer[]  values;

    public ArrayManipulation(Integer[] values) {
        this.values = values;
    }


    public static void forEach(Consumer<Integer> consumer) {
        for (int value : values) {
            consumer.accept(value);
        }

    }

    public static void delete(Predicate<Integer> predicate) {
        for (int i = 0; i < values.length; i++) {
            if (predicate.test(values[i])) {
                values[i] = 0;

            }

        }
    }
    public static void modify(Function<Integer, Integer> function){
                 for(int i=0;i<values.length;i++) {
                     values[i] = function.apply(values[i]);
                }
             }

     public static int fold(BiFunction<Integer, Integer, Integer> biFunction) {
                 int result = values[0];
                 for (int i = 1; i < values.length;i++) {
                         result = biFunction.apply(result,values[i]);
                     }
                 return result;
             }





}