package java_homework_week_8_paresha;

/**8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 *
 */
public class Programme_8_TriangleNestedForLoop {
    public static void main(String [] args) {//main loop
        int rows = 5;
        for(int i =1; i<=rows; i++ )//nested for loop to print @ triangle
        {
            for(int j=1; j<=i; ++j)
            {
                System.out.print("@");
            }
            System.out.println();

        }
    }
}
