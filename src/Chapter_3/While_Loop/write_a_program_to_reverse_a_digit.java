package Chapter_3.While_Loop;

public class write_a_program_to_reverse_a_digit {
    public static void main(String[] args) {
        int ornumber = 123, rem , rev=0 , n=ornumber;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("reverse of "+ornumber+" is : "+rev);
    }
}
