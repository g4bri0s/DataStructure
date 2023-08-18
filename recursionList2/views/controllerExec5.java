package recursionList2.views;

import recursionList2.controllers.exercise5;

public class controllerExec5 {

    public static void main(String[] args) throws InterruptedException {

        exercise5 exercise5 = new exercise5();

        double mdc = exercise5.mdc(5, 39);

        System.out.println("MDC :" + mdc);

    }
}
