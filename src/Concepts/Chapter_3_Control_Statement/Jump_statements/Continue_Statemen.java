package Concepts.Chapter_3_Control_Statement.Jump_statements;

public class Continue_Statemen {
    public static void main(String[] args) {
        System.out.println("------Continue Statement-----");
        for (int i = 0; i < 6; i++) {
            if(i==3)
            {
                System.out.println(i);
                continue;
            }
            System.out.println("continue statement done "+i);
        }
    }
}
