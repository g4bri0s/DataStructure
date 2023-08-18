package recursionList2.views;

import recursionList2.controllers.exercise1;

public class controllerExec1 {

    public static void main(String[] args) throws InterruptedException {

        exercise1 exercise1 = new exercise1();

        int multiplieSums = exercise1.multiplieSums(0, 0);

        System.out.println("Soma de 1 a 5: " + multiplieSums);
    }

}
