package recursionList3.views;

import recursionList3.controllers.exercise3;

public class controllerExec3 {

    public static void main(String[] args) throws InterruptedException {

        exercise3 exercise3 = new exercise3();

        String reverseString = exercise3.reverseString("Some string");

        System.out.println("String reversa: " + reverseString);
    }

}