package recursionList3.views;

import recursionList3.controllers.exercise1;

public class controllerExec1 {

    public static void main(String[] args) throws InterruptedException {

        exercise1 exercise1 = new exercise1();

        int length = exercise1.length(35054);

        System.out.println("Quantidade de digitos: " + length);
    }

}
