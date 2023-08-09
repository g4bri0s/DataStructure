package controllers;

import recursionList1.exercise1;
import recursionList1.exercise2;
import recursionList1.exercise3;
import recursionList1.exercise4;
import recursionList1.exercise5;

public class controller {

    public static void main(String[] args) throws InterruptedException {

        exercise1 exercise1 = new exercise1();
        exercise2 exercise2 = new exercise2();
        exercise3 exercise3 = new exercise3();
        exercise4 exercise4 = new exercise4();
        exercise5 exercise5 = new exercise5();

        int[] negativeSumVector = { 1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
        int negativeSumLength = negativeSumVector.length - 1;

        int[] vector = { 1, 2, 3, 4, 5 };
        int length = vector.length - 1;

        int sumN = exercise1.sumN(5);
        int lesserNVector = exercise2.lesserNVector(vector, length);
        double factorial = exercise3.factorial(5);
        int negativeSum = exercise4.negativeSum(negativeSumVector, negativeSumLength);
        double harmonicSum = exercise5.harmonicSum(5);

        System.out.println("Soma de 1 a 5: " + sumN);

        Thread.sleep(5000);

        System.out.println("Menor valor do vetor: " + lesserNVector);

        Thread.sleep(5000);

        System.out.println("Fatorial de 5: " + factorial);

        Thread.sleep(5000);

        System.out.println("Quantidade de numeros negativos: " + negativeSum);

        Thread.sleep(5000);

        System.out.println("Soma harmonica de 1 a 5: " + harmonicSum);

    }

}
