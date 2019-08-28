import java.util.ArrayList;
import java.util.Collections;
/**
 * Represent Fibonacci numbers
 */
public class Fibonacci {
    /**
     * the size of the sequence
     */
    private int n;

    private ArrayList<Long> listOfFibonacciNumbers;

    /**
     * @param size - the size of the sequence
     *
     */
    public Fibonacci(final int size) {
        this.n = size;
        listOfFibonacciNumbers = new ArrayList<Long>(this.n);
        buildFibonacci();
    }
    /**
     * Build fibonacci array list.
     * @return the current object instance
     */
    private Fibonacci buildFibonacci() {

        long t1 = 0;
        long t2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");
            listOfFibonacciNumbers.add(t1);
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return this;
    }
    /**
     * this method print the biggest even and odd numbers in the sequence.
     *  F1-maxOddNumber
     *  F2-maxEvenNumber
     */
    public void printTheBiggestEvenAndOddFibonacciNumbers() {
        ArrayList<Long> evenNumbers = new ArrayList<>();
        ArrayList<Long> oddNumbers = new ArrayList<>();
        for (long number : listOfFibonacciNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        long maxEvenNumber = Collections.max(evenNumbers);
        long maxOddNumber = Collections.max(oddNumbers);

        System.out.println("\nF1= " + maxOddNumber + "\tF2= " + maxEvenNumber);
    }
    /**
     * this method print percentage of odd and even fibonacci numbers.
     */
    public void printPercentageOfOddAndEvenFibonacciNumbers() {
        int countEven = 0;
        for (long number : listOfFibonacciNumbers) {
            if (number % 2 == 0) {
                countEven++;
            }
        }
        double percentageOfEven = 100d * countEven / n;
        double percentageOfOdd = 100d - percentageOfEven;
        System.out.println("\npercantage of even nubmers: " + percentageOfEven);
        System.out.println("\npercantage of odd nubmers: " + percentageOfOdd);
    }
}
