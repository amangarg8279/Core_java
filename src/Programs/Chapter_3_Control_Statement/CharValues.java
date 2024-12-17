package Programs.Chapter_3_Control_Statement;

public class CharValues
{
    public static void main(String[] args) {
        for(int i=0; i<1000;i++)
        {
            if (!(i % 10 == 0)) {
                System.out.print((char) i);
            } else {
                System.out.println();
            }
        }
    }
}
