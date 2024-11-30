package Concepts.Chapter_3_Control_Statement.Jump_statements;

public class Break_statement {
    public static void main(String[] args) {
        System.out.println("------ Using break statement-------");
        for(int i=0; i<6;i++)
        {
            System.out.println("value of i : "+i);
            if(i==4){
                System.out.println("we are breaking at 4");
                break;
            }
        }
        System.out.println("---------break statement completed------------");
        System.out.println("------ Using break statement in nested loop for outer loop -------");
// outer is just a name not a keyword ':' is the way to give name.
        outer: for(int i=0; i<3;i++)
        {
            System.out.println("value of i : "+i);
            for(int j=0; j<3;j++)
            {
                System.out.println("------value of j : "+j);
                if(i==2){
                    System.out.println("we are breaking at "+i);
                    break outer;
            }

            }
        }
        System.out.println("---------break statement completed in nested loop for outer loop------------");

    }
}
