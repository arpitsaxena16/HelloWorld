/**
 * Created by katkhedd on 7/28/2017.
 * Design your calculator API to be distributed to other developers
 in such a way so that other developers can pass different
 implementation of it in the form of lambdas.
 */
public class Calculator {
    public static void main(String[] args) {

        CalculateService.service(3.5, 5.5, (num1, num2) -> {
            System.out.println("Sum : " + (num1 + num2));
        });
        CalculateService.service(8.5, 5.5, (num1, num2) -> {
            System.out.println("Substraction : " + (num1 - num2));
        });
        CalculateService.service(5.5, 1.5, (num1, num2) -> {
            System.out.println("Multiplication : " + (num1 * num2));
        });
        CalculateService.service(3.5, 0.5, (num1, num2) -> {
            System.out.println("Division : " + (num1 / num2));
        });



//        Calculate sum = (num1, num2) -> num1 + num2;
//        Calculate substact = (num1, num2) -> num1 - num2;
//        Calculate multiply = (num1, num2) -> num1 * num2;
//        Calculate divide = (num1, num2) -> num1 / num2;
//
//        double ans1 = sum.calculation(3.5, 6.0);
//        double ans2 = substact.calculation(10.0, 6.0);
//        double ans3 = multiply.calculation(3.5, 2.0);
//        double ans4 = divide.calculation(3.5, 0.5);
//
//        System.out.printf("Sum : %f, substraction : %f, multiplication : %f, division : %f",ans1,ans2,ans3,ans4);
//    }
    }
}
