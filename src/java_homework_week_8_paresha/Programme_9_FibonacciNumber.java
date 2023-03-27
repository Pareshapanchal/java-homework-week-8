package java_homework_week_8_paresha;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String [] args) {//main method

        int firstNumber =0, secondNumber =1, nextNumber;
        int n =10;
        System.out.println("Fibonacci series till "+ n + "terms: ");
        for(int i =1; i<=n; i++)//for loop for printing fibonacci numbers
        {
            System.out.print(firstNumber +",");
            //fibonacii calculation
            nextNumber = firstNumber+ secondNumber;
            firstNumber =secondNumber;
            secondNumber =nextNumber;
        }

    }
}
