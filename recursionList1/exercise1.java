package recursionList1;

public class exercise1 {

    public exercise1() {
        super();
    }

    public int sumN(int n) {

        // quando o n chegar a 0, a recursão para
        if (n <= 0) {
            return 0;
        }
        // a recusão é chamada novamente, decrementando o n
        return n + sumN(n - 1);
    }
}