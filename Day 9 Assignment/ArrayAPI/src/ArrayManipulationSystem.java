import java.lang.reflect.Array;

/**
 * Created by katkhedd on 7/28/2017.
 * Collect some numbers in an array and design an API around it
 so that developers who will use your API should be able to
 do different manipulations on these numbers on the fly.
 Hint - use functional interface

 */
public class ArrayManipulationSystem {
    static Integer[] values ;
    public static void main(String[] args) {

        Integer[] values = {2,33,45,67,57,21,19,56,70};
        ArrayManipulation manipulate = new ArrayManipulation(values);
        System.out.println("=========Printing Array elements==========");
        ArrayManipulation.forEach((Integer a)-> System.out.println(a));

        System.out.println("=========Deleting array elements less than 30==========");
        ArrayManipulation.delete((Integer num)-> {

            return num < 30;
        });
        for (int value : values) {
            System.out.println(value);
        }

        System.out.println("=========Modifying Array==========");
        ArrayManipulation.modify((Integer num)-> {

            return num * num;
        });
        for (int value : values) {
            System.out.println(value);
        }


        System.out.println("========Folded Array===========");
        System.out.println(ArrayManipulation.fold((Integer num1,Integer num2)-> {

            return num1 +  num2;
        }));

    }


}
