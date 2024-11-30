package Concepts.Chapter_3_Control_Statement.Loops.While_Loop;

public class program_to_get_length_of_integer_value {
    public static void main(String[] args) {
        //1. writing program to get length of integer value
        int intval=98756241,result=0;
        while(intval!=0)
        {
            result+=1;
            intval=intval/10; // if we use / symbol then it will retrun qoutation of number divide
        }
        System.out.println(result);
    }
}
