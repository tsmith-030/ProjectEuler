/**
 * Created by tsmj2 on 3/21/18.
 */
public class EulerRunner {

    public static void main(String args[]) {
        fibonacciEvenNumbers();
    }

    //Problem = 1
    private static void multiplesOf3And5() {
        MultiplesOf3And5 computer = new MultiplesOf3And5(1000000);
        System.out.println(computer.getSum());
    }

    //Problem = 2
    private static void fibonacciEvenNumbers() {
        FibonacciEvenNumbers computer = new FibonacciEvenNumbers();
        System.out.println(computer.getSum());
    }

    //Problem = 3

}
