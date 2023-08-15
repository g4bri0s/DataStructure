package recursionList1.views;

import recursionList1.controllers.exercise5;

public class controllerExec5 {
    public static void main(String[] args) throws InterruptedException {

        exercise5 exercise5 = new exercise5();

        double harmonicSum = exercise5.harmonicSum(5);

        System.out.println("Soma harmonica de 1 a 5: " + harmonicSum);

    }
}
