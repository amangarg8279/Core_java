package Programs.Chapter_3_Control_Statement;

import java.util.Scanner;

public class Factorial_of_Number_Recusion {
    static int result=1;
    public static void main(String[] args) {
        Factorial_of_Number_Recusion factorialOfNumberRecusion = new Factorial_of_Number_Recusion();
        factorialOfNumberRecusion.rec_fun(10);
        System.out.println(result);
    }

    void rec_fun(int number) {
        if (number > 0) {
            result=result*number;
            number--;
            rec_fun(number);
        }
    }
}
