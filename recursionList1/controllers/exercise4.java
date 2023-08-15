package recursionList1.controllers;

public class exercise4 {
    public exercise4() {
        super();
    }

    public int negativeSum(int[] vector, int length) {

        // quadno o length chegar a 0 ( primeira posição), a recursão para
        if (length == 0) {
            return vector[length];
        }

        // a recursão é chamada novamente, decrementando o length, para encontrar o
        // proximo elemento
        int n = negativeSum(vector, length - 1);

        if (vector[length] < 0) {
            return 1 + n;
        }
        return 0 + n;
    }
}
