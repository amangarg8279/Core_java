package Concepts.Chapter_3_Control_Statement.Loops.For_Loop;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println("----- Table of 2 ------");
        for (int i = 1; i < 11; i++) {
            System.out.println(2 *i);
        }
        /*
        * in java we can initailize early only becuase it work only once
        * */
        int j=1;
        for(; j<5;j++)
        {
            System.out.println(1+j);
        }

        /*Suppose after initalization used print statement in for loop itself inplace of intitialzation then as in loop initalization work only once
        * so it will print only once */
        int k=1;
        for(System.out.println("hello I am inplace of intt. of for loop"); k<5;k++)
        {
            System.out.println(1+k);
        }
    }
}
