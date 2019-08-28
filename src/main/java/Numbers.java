/**
 * this class represents odd ane even numbers.
 */
public class Numbers {
    /**
     * the start of the interval.
     */
    private int from;
    /**
     * the end of the interval.
     */
    private int to;

    /**
     * constructor - create new object.
     *
     * @param start - the start of the interval
     * @param end   - the end of the interval
     */
    public Numbers(final int start, final int end) {
        this.from = Math.abs(start);
        this.to = Math.abs(end);
    }

    /**
     * this method prints odd numbers
     * from start to the end of interval and even from end to start.
     */
    public void printOddAndEvenNumbers() {
        System.out.println("odd numbers:");
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\neven numbers:");
        for (int i = to; i >= from; i--) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    /**
     * this method prints the sum of
     * odd and even numbers in the interval.
     */
    public void printSumOfOddAndEvenNumbers() {
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += i;
            } else {
                sumOfOddNumbers += i;
            }
        }
        System.out.println('\n');
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}
