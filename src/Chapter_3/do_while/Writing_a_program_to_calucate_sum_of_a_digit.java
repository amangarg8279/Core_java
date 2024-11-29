package Chapter_3.do_while;

import java.util.Scanner;

public class Writing_a_program_to_calucate_sum_of_a_digit {
    public static void main(String[] args) {
        // Do while loop used to run atleast one time.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number to get sum of it -> ");
        int val=scanner.nextInt();
        int tempVal=val,sum=0;
        do{
            sum=sum+tempVal%10;
            tempVal=tempVal/10;
        }
        while(tempVal!=0);
        System.out.println("the sum of "+val + " is :"+sum);
    }
    }
