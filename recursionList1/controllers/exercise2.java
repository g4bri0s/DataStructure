package recursionList1.controllers;

public class exercise2 {

    public exercise2() {
        super();
    }

    public int lesserNVector(int[] vector, int length) {

        // quadno o length chegar a 0 ( primeira posição), a recursão para
        if (length == 0) {
            return vector[length];
        }

        // a recursão é chamada novamente, decrementando o length
        int n = lesserNVector(vector, length - 1);

        if (vector[length] > n) {
            return n;
        }
        return vector[length];
    }
}
