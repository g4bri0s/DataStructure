package recursionList3.views;

import recursionList3.controllers.exercise5;

public class controllerExec5 {

    public static void main(String[] args) throws InterruptedException {

        exercise5 exercise5 = new exercise5();

        int fibonacci = exercise5.fibonacci(15);

        System.out.println("Fibonacci: " + fibonacci);
    }

}