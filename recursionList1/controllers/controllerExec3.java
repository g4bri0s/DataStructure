package recursionList1.controllers;

import recursionList1.exercises.exercise3;

public class controllerExec3 {
    public static void main(String[] args) throws InterruptedException {

        exercise3 exercise3 = new exercise3();

        double factorial = exercise3.factorial(5);

        System.out.println("Fatorial de 5: " + factorial);
    }
}
