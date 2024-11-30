package Programs.Chapter_3_Control_Statement;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tmpNumber = number,rev=0,rem=0;
        while (tmpNumber != 0) {
            rem=tmpNumber%10;
            rev=rev*10+rem;
            tmpNumber=tmpNumber/10;
        }

        System.out.println((number==rev) ? true : false);

    }
}
