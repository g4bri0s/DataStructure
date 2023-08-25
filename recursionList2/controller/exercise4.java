package recursionList2.controller;

public class exercise4 {

    public exercise4() {
        super();
    }

    public int dualFactorial(int a) {

        // quando o b chegar em 0, a recurs�o termina
        if (a <= 1) {
            return 1;
        }

        // a recurs�o � chamada decrementando a em 2
        return 1 * dualFactorial(a - 2);
    }
}