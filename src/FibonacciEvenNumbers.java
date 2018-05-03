/**
 * Created by tsmj2 on 3/22/18.
 *
 * Calculates the sum of all even fibonacci numbers lte 4 million
 *
 * Status: COMPLETE
 */
public class FibonacciEvenNumbers {
    long sum = 2;
    long prevOne = 1;
    long prevTwo = 2;

    public long getSum() {
        long nextNum = prevOne + prevTwo;
        //base case
        if(nextNum >= 4000000) {
            return sum;
        }

        if(nextNum%2 == 0) {
            sum += nextNum;
        }
        prevOne = prevTwo;
        prevTwo = nextNum;

        return getSum();
    }
}
