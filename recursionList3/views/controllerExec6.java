package recursionList3.views;

import recursionList3.controllers.exercise6;

public class controllerExec6 {

    public static void main(String[] args) throws InterruptedException {

        exercise6 exercise6 = new exercise6();

        double harmonicSum = exercise6.harmonicSum(15);

        System.out.println("Soma harmonica por fatorial: " + harmonicSum);
    }

}
