package java_homework_week_8_paresha;
import java.util.Scanner;
/**7. First And Last Digit Sum
 Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 The method needs to find the first and the last digit of the parameter number passed to the method,
 using a loop and return the sum of the first and the last digit of that number.
 If the number is negative then the method needs to return -1 to indicate an invalid value.

 Example input/output
 * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which

 gives us 0+0 and the sum is 0.

 * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 gives us 5+5 and the sum is 10.
 * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 *
 */
public class Programme_7_FirstAndLastDigitSum {
    public static void main(String [] args)//main method
    {
        int result,number;
        boolean flag = false;

        Scanner scanobj = new Scanner(System.in);

        System.out.print("Enter a Positive Number:-->   " );// reading input number
        flag = scanobj.hasNextInt();// check whether input value is number
        if(flag == true) {
            number = scanobj.nextInt();
            result = sumFirstAndLastDigit(number);// passing the input number in the method and get output

            if(result == -1)
            {
                System.out.println("Number is Negative need to be Positive");
            }
            else
            {
                System.out.println("========================================================");
                System.out.println("Sum of first and last digit of number is :--> " + result);
            }
        }
        else
        {
            System.out.println("Invalid Entry");
        }


    }
    //this method will check whether the number is a postive number and then add the first and last digit of the number
    //if passing number is negative then it will return -1
    public static int sumFirstAndLastDigit(int number)
    { int lastDigit, firstDigit,reverse =0;

        if(number <0)
        {
            return  -1;
        }
        else
        {
            lastDigit = number%10;
            while(number!=0)
            {
                reverse = reverse * 10 + number % 10;
                number = number / 10;
            }

            firstDigit = reverse %10;
            return firstDigit+lastDigit;
        }
    }
}
