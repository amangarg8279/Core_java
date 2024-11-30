package Programs.Chapter_3_Control_Statement;

import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int val=number,result=1;
        while(val!=0)
        {
          /*  System.out.print(val+"*");*/
        result=result*val;
            val--;
        }
        System.out.println(" Fractor of "+number+" : " +result);
    }

}
