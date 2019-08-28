/**
 * this class represents
 * odd ane even numbers.
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
     * @param from - the start of the interval
     * @param to - the end of the interval

     */
    public Numbers(final int from,final int to) {
        this.from = Math.abs(from);
        this.to = Math.abs(to);
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
