package recursionList1;

public class exercise3 {

    public exercise3() {
        super();
    }

    public int factorial(int n) {

        if (n > 12) {
            throw new IllegalArgumentException("n must be less than 12");
        }

        // quando o n chegar a 0, a recursão para
        if (n <= 0) {
            return 1;
        }
        // a recusão é chamada novamente, decrementando o n
        return n * factorial(n - 1);
    }

}
