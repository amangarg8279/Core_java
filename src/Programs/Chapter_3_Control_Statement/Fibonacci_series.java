package Programs.Chapter_3_Control_Statement;

public class Fibonacci_series {
    public static void main(String[] args) {
        int fb_ser=0;
        System.out.println("-- Program Start----");
        for(int i=1; i<=10;i++){
           /* System.out.print("sum of pervious digit :" + fb_ser);
            System.out.println(" , value adding now :" + i);*/
            System.out.print(fb_ser+"  ");
            fb_ser=fb_ser+i;

        }
        System.out.println("sum of fibonacci series is = "+fb_ser);
    }
}
