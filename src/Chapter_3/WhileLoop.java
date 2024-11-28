package Chapter_3;

public class WhileLoop {
    public static void main(String[] args) {
        int i=0;
        while(i<5)
        {
            System.out.println("Hello Aman, time = " +i);
            i++;
        }

        // writing program to get length of integer value
        int intval=98756241,result=0;
        while(intval!=0)
        {
            result+=1;
            intval=intval/10; // if we use / symbol then it will retrun qoutation of number divide
        }
        System.out.println(result);
    }
}
