/**
 * Created by tsmj2 on 3/21/18.
 *
 * This calculator find the sum of every number below the given target which is a multiple of 3 or 5
 *
 * Status: COMPLETE
 */
public class MultiplesOf3And5 {
    private long target;

    MultiplesOf3And5(long target) {
        this.target = target - 1;
    }

    public long getSum() {
        return sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
    }

    private long sumDivisibleBy(long i) {
        return i*(target/i)*(1 + (target/i))/2;
    }
}
