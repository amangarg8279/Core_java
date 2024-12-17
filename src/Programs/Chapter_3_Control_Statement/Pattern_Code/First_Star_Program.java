package Programs.Chapter_3_Control_Statement.Pattern_Code;

public class First_Star_Program {
    public static void main(String[] args) {
        System.out.println("1st program");
        System.out.println("-------------");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");
        System.out.println("2nd program");
        System.out.println("-------------");
        for (int i = 4; i >=0; i--) {
            for (int j = i; j >= 0; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------z-");
    }
}

