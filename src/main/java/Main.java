import java.util.Scanner;
/**
 * The class Main is used to solve following tasks:
 * -print odd numbers
 * from start to the end of interval and even from end to start;
 * -print the sum of odd and even numbers;
 * -build Fibonacci numbers:
 * F1 will be the biggest odd number;
 * F2 the biggest even number;
 * user can enter the size of set (N);
 * -print percentage of odd and even Fibonacci numbers;
 *
 * @author Yura Savchenko
 * @version 1.0
 * @since 25.08.2019
 */
public class Main {
    /**
     * The entry point of application.
     * This is the main method which execute program
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the interval:");
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        Numbers numbers = new Numbers(from, to);
        numbers.printOddAndEvenNumbers();
        numbers.printSumOfOddAndEvenNumbers();
        System.out.println("enter the size of sequence(fibonacci numbers):");
        int n = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci(n);
        fibonacci.printPercentageOfOddAndEvenFibonacciNumbers();
        fibonacci.printTheBiggestEvenAndOddFibonacciNumbers();
    }

}
