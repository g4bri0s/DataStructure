package recursionList3.controllers;

public class exercise2 {

    public exercise2() {
        super();
    }

    public int timesIntAppears(int n, int d) {
        if (n == 0) {
            return 0;
        }
        return ((n % 10 == d) ? 1 : 0) + timesIntAppears(n / 10, d);
    }
}