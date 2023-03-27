package java_homework_week_8_paresha;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class Programme_15_TriableUsingNestedLoop {
    public static void main(String [] args)//main method
    {
        int row =5;
        for(int i =1; i<=row;++i)//nested for loop to print right angle triangle
        {
              for(int j=1; j<=i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
