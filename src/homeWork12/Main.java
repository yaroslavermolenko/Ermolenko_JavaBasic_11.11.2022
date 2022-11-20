package homeWork12;

public class Main {

    public static void main(String[] args) {

        int fibonacciLoop = new FibonacciMethod().fibLoop(4);
        System.out.println(fibonacciLoop);

        int fibonacciRecursion = new FibonacciMethod().fibRecursion(4);
        System.out.println(fibonacciRecursion);

    }
}