package Concepts.Chapter_3_Control_Statement.Loops.do_while;

import java.util.Scanner;

public class creating_calcuator_from_switch_condition_based {
    public static void main(String[] args) {
        // creating calcuator from switch
        System.out.println("------Welcome to calucator----------");
        System.out.println(" Let's Go Y/N");
        Scanner scanner = new Scanner(System.in);
        String start=scanner.next();
        do {

            System.out.println("Please enter number 1 and number 2");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println("Please enter symbol * , + ,/ , -");
            String sbml = scanner.next();
            switch (sbml) {
                case "+" -> System.out.println(n1 + n2);
                case "-" -> System.out.println(n1 - n2);
                case "*" -> System.out.println(n1 * n2);
                case "/" -> System.out.println(n1 / n2);
                default -> System.out.println("You didn't given correct symbol please try again");
            }
        }while(start.equalsIgnoreCase("y"));
    }
}

