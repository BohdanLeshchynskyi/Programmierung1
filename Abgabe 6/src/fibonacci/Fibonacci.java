package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int limit = 21;

        System.out.println("n = " + n);
        System.out.println("limit = " + limit + "\n");
        System.out.println("fibonacci(n) = " + fibonacci(n));
        System.out.println("fibonacciAsLoop(n) = " + fibonacciAsLoop(n) + "\n");
        fibonacciSequence(limit);
    }

    static int fibonacciMemoized(int n, int[] mem) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (mem[n] != 0) {
            return mem[n];
        } else {
            mem[n] = fibonacciMemoized(n - 1, mem) + fibonacciMemoized(n - 2, mem);
            return mem[n];
        }
    }

    /*static int fibonacci(int n) {
        int[] mem = new int[n + 1];
        return fibonacciMemoized(n, mem);
    }*/

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int fibonacciAsLoop(int n) {
        int predaccesor = 1;
        int predPredaccesor = 1;
        int fibNum = 1;
        for (int i = 3; i <= n; i++) {
            fibNum = predaccesor + predPredaccesor;
            predPredaccesor = predaccesor;
            predaccesor = fibNum;
        }
        return fibNum;
    }

    static void fibonacciSequence(int limit) {
        String plot = "";
        plot = plot + "Fibonacci-Folge von n=1 bis n=" + limit + "\n";

        for (int i = 1; i < limit; i++) {
            plot = plot + fibonacci(i) + ", ";
        }
        plot = plot + fibonacci(limit);

        System.out.println(plot);
    }
}
