package java_homework_week_8_paresha;

/**14. Write a program in Java to display the pattern like a diamond.
 While loop
 *
 ***
 *****
 *******
 *********
 ***********
 *************
 ***********
 *********
 *******
 *****
 ***
 *
 *
 */
public class Programme_14_PrintingDiamondPattern {

    public static void main(String [] args)//main method
    {
          printUpperPart();//method will print upper half of diamand shape
         printBottomPart();//method will print bottom half  of diamond shape
    }
    public static void printUpperPart() //method will use nested for loops to print upper half of diamond
    { int upper_row =7, u=0;
        for(int i =1; i<=upper_row;++i,u=0)
        {
            for(int space =1; space<=upper_row-i; ++space){
                System.out.print("   ");
            }
            while(u!=2*i-1)
            {
                System.out.print("*  ");
                ++u;
            }
            System.out.println();
        }
    }
    public static void printBottomPart()// method will use nested for loops to print bottom half of diamond
    { int bottom_row =6;
        for(int i = bottom_row; i>=1; --i)
        {
            for(int space =0; space <= bottom_row-i; ++space) {
                System.out.print("   ");
            }
            for (int j=i-1; j<2*i-2; ++j) {
                System.out.print("*  ");
            }
            for(int j =0; j<= i-1; ++j){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
