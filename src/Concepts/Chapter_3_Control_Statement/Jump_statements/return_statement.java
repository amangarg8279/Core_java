package Concepts.Chapter_3_Control_Statement.Jump_statements;

public class return_statement {
int sum(int a, int b){
    return a+b;
}

    public static void main(String[] args) {
return_statement rt=new return_statement();
        System.out.println(rt.sum(23,45));
    }
}