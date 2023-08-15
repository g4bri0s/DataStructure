package recursionList3.controllers;

public class exercise5 {

    public exercise5() {
        super();
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}