package java_homework_week_8_paresha;
import java.util.Scanner;

/**10. Write a program to input any number and check if it Armstrong number or not
 153 = (1*1*1)+(5*5*5)+(3*3*3)
 where:
 (1*1*1)=1
 (5*5*5)=125
 (3*3*3)=27
 So:
 1+125+27=153
 *
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String [] args)//main method
    {
       int number,original_number,remainder, result =0;

        Scanner scanobj = new Scanner(System.in);
        System.out.print("Enter Number:-->");// reading input number
        number = scanobj.nextInt();
        original_number = number;
        // calculation for armstrong number
       while(original_number !=0)
       {
           remainder = original_number %10;
           result +=Math.pow(remainder,3);
           original_number/=10;
       }
       if(result == number)
           System.out.println(number+ " is an Armstrong Number");
       else
           System.out.println(number+ "  is not an Armstrong Number");
       scanobj.close();
    }

}
