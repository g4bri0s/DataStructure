package recursionList1.exercises;

public class exercise5 {

    public exercise5() {
        super();
    }

    public double harmonicSum(int n) {

        // quando o n chegar a 1, a recursão para
        if (n == 1) {
            return 1.0;
        }
        // a recusão é chamada novamente, decrementando o n
        return 1.0 / (double) n + harmonicSum(n - 1);
    }
}
