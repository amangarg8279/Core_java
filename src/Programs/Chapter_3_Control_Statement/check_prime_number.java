package Programs.Chapter_3_Control_Statement;

import java.util.Scanner;

public class check_prime_number {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check if number is prime number");
        int number=scanner.nextInt();
        int tmp_num=number;
        for (int i=2; i<number-1;i++)
        {
            if(number%i==0)
            {
                System.out.println("Number is not prime number");
                break;
            }
        }
        System.out.println();
    }


}
