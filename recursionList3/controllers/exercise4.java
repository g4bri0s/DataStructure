package recursionList3.controllers;

public class exercise4 {

    public exercise4() {
        super();
    }

    public String convertToBinaryString(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return convertToBinaryString(n / 2) + (n % 2);
    }
}
