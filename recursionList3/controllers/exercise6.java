package recursionList3.controllers;

public class exercise6 {

    public exercise6() {
        super();
    }

    public double harmonicSum(int n) {
        if (n == 1) {
            return 1;
        }
        return (1.0 / factorial(n)) + harmonicSum(n - 1);
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
