package recursionList1.views;

import recursionList1.controllers.exercise2;

public class controllerExec2 {
    public static void main(String[] args) throws InterruptedException {

        exercise2 exercise2 = new exercise2();

        int[] vector = { 1, 2, 3, 4, 5 };
        int length = vector.length - 1;

        int lesserNVector = exercise2.lesserNVector(vector, length);

        System.out.println("Menor valor do vetor: " + lesserNVector);
    }
}
