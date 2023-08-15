package recursionList3.controllers;

public class exercise4 {

    public exercise4() {
        super();
    }

    public int convertToBinary(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 2 + 10 * convertToBinary(n / 2));
        }
    }
}