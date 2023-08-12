package Week2.Day4;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci Series ");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci (i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci (n - 1 ) + fibonacci ( n - 2);
        }

    }
}
