package Concepts.Chapter_3_Control_Statement.Switch_case;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        // creating calcuator from switch
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number 1 and number 2");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Please enter symbol * , + ,/ , -");
        String sbml=scanner.next();
        switch (sbml){
            case "+" -> System.out.println(n1+n2);
            case "-" -> System.out.println(n1-n2);
            case "*" -> System.out.println(n1*n2);
            case "/" -> System.out.println(n1/n2);
            default ->System.out.println("You didn't given correct symbol please try again");
        }
    }
}
