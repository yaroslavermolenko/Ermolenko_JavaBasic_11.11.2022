package homeWork12;

public class FibonacciMethod {

    public int fibLoop(int n) {

        if (n == 0) {
            return 0;
        }

        if (n < 0 || n > 30) {
            throw new IndexOutOfBoundsException();
        }

        int n0 = 0;
        int n1 = 1;
        for (int i = 2; i <= n; i++) {
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;

    }


    public int fibRecursion(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }
}