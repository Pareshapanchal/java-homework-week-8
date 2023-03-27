package java_homework_week_8_paresha;

/**
 /**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Programme_6_PrintTriangleWithNumer {
    public static void main(String [] args)
    {
        int row =10;
        for(int i=1; i<= row; i++)// for loop for ten lines
        {  for(int j=1; j<=i; ++j)//for loop to print numbers
            {
                System.out.print(j+" ");//print the numbers
            }
            System.out.println();

        }

    }
}
