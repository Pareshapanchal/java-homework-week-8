package java_homework_week_8_paresha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String [] args)//main methothod
    {
       boolean isNumberInt;
        int number1,number;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();//array list created to store the number

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter Number:->");
        isNumberInt = sobj.hasNextInt();
        if(isNumberInt == false)
            System.out.println("Invalid Entry");

        else {
            number = sobj.nextInt();

            while (isNumberInt == true) {
                System.out.print("Enter Number:->");//reading input numbers from user
                isNumberInt = sobj.hasNextInt();// check if number is integer
                if (isNumberInt == false) {
                    break;
                } else {

                    number = sobj.nextInt();
                    arrayList.add(number);//add all the number in the arraylist

                }
            }

            Integer max = Collections.max(arrayList);//find the maximum number from the input number
            Integer min = Collections.min(arrayList);//find the minimum number from the input number

            System.out.println("List of Number Entered:--> " + arrayList);// print array list of numbers
            System.out.println("Maximum Number:-->" + max);// print the maximum number
            System.out.println("Minimum Number:-->" + min);// print the minimum number
        }
        sobj.close();//scanner object is closed
    }
}
