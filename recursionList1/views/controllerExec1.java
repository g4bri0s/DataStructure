package recursionList1.views;

import recursionList1.controllers.exercise1;

public class controllerExec1 {

    public static void main(String[] args) throws InterruptedException {

        exercise1 exercise1 = new exercise1();

        int sumN = exercise1.sumN(5);

        System.out.println("Soma de 1 a 5: " + sumN);
    }

}
