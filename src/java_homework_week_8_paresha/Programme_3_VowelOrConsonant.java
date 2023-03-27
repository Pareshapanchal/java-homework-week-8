package java_homework_week_8_paresha;
import java.util.Scanner;
/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_VowelOrConsonant {
    public static void main(String[] args) {//main method

        char c[] = {'a', 'e', 'i', 'o', 'u'};// vowels stroed in character array
        boolean flag = false;
        char ch;
        String inputStr;
        String ans, ans1 = "yes";

        Scanner so = new Scanner(System.in);

        do {
            System.out.print("Enter a Single Letter:-->");//reading input
            inputStr = so.next();

            if (inputStr.length() > 1)// condition to check whether the input has more than one character
            {
                System.out.println("Invalid entry");
                break;
            } else {
                ch = inputStr.charAt(0);  // convert string to character

                if (Character.isAlphabetic(ch)) {// condition to check whether the character is alphabet
                    for (int i = 0; i < c.length; i++) {// loop will check if letter is vowel or not
                        if (ch == c[i]) {
                            System.out.println("Letter is Vowels");
                            flag = true;
                            break;
                        }
                    }
                } else {
                    System.out.println(ch + "   is not a letter");
                    break;
                }
            }
            if (flag == false) {
                  System.out.println("Letter is Consonant");
            }

            System.out.println("Do you want to continue(yes/no):-->");// give user a chance to find out more character
            ans = so.next();
            } while (ans.equals(ans1)) ;
            so.close();//scanner object closed

    }
}


