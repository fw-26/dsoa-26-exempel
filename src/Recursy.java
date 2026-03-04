public class Recursy {
    static long ops = 0;
    /**
     * Recursive loop
     */
    static void loop(int i, int max) {
        if (i > max) return;
        System.out.print(i + " ");
        loop(i+1, max); // loop(1, max)... loop (2, max)...
    }

    /**
     *  Fibonacci
     *  "vilket är det n:te talet i serien"
     */
    static int fib(int n) {
        ops++;
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    /**
     * Better fib with memoization
     */
    static long[] fibCache = new long[10000];
    static long fastFib(int n) {
        ops++;
        if (n <= 1) return n;
        if (fibCache[n] != 0) return fibCache[n];
        long ret = fastFib(n-1) + fastFib(n-2);
        fibCache[n] = ret;
        return ret;
    }

    /**
     * CC Accursed Recursion
     */
    static void countdown(int i) {
        if (i < 0) return;
        System.out.print(i + " ");
        countdown(i-1);
    }
    static int pow(int n, int exp) {
        if (exp <= 1) return n;
        return n * pow(n, exp-1);
    }

}
