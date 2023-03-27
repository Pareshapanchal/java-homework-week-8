package java_homework_week_8_paresha;
import java.util.Scanner;
/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */
public class Programme_4_DigitSumChallenge {
    static  int sum=0;
    public static void main(String [] args)//main method
    {
        int inputNumber;
        int sumOfDigit;
        Scanner so = new Scanner(System.in);
        System.out.println("Enter a number greater than 10 :-->");// reading input number
        inputNumber = so.nextInt();

        sumOfDigit = sumDigits(inputNumber);// passing number to the method and calling method

        if(sumOfDigit == -1)//if return value sumDigit method is -1 then error message occurs
        {
            System.out.println("Invalid number");

        }
        else
        {
            System.out.println("Sum of the number is  "+sumOfDigit); // otherwise printing the sum of the number
        }
    }
    public static int sumDigits(int number)// method to calculate the sum of all the digit in the number
    {
        if(number<=10)// condition to check whether the input number is greater than 10
        {
            return -1;
        }
        else
        {
            while(number!=0)// while loop to add all the digit in the number
            {
                sum= sum+ number%10;
                number = number/10;
            }
            return sum;
        }

    }
}
