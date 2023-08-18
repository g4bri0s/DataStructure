package recursionList2.views;

import recursionList2.controllers.exercise3;

public class controllerExec3 {
    public static void main(String[] args) throws InterruptedException {

        int[] a = { 1, 2, 3, 4, 5 };

        int b = a.length - 1;

        exercise3 exercise3 = new exercise3();

        double positivesArray = exercise3.positivesArray(a, b);

        System.out.println("Pares no vetor:" + positivesArray);
    }
}
