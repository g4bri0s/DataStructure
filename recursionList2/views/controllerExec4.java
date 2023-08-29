package recursionList2.views;

import recursionList2.controller.exercise4;

public class controllerExec4 {
    public static void main(String[] args) throws InterruptedException {

        exercise4 exercise4 = new exercise4();

        int dualFactorial = exercise4.dualFactorial(8);

        System.out.println("Fatorial duplo: " + dualFactorial);

    }
}
