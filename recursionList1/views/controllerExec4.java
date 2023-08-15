package recursionList1.views;

import recursionList1.controllers.exercise4;

public class controllerExec4 {
    public static void main(String[] args) throws InterruptedException {

        exercise4 exercise4 = new exercise4();

        int[] negativeSumVector = { 1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
        int negativeSumLength = negativeSumVector.length - 1;

        int negativeSum = exercise4.negativeSum(negativeSumVector, negativeSumLength);

        System.out.println("Quantidade de numeros negativos: " + negativeSum);

    }
}
