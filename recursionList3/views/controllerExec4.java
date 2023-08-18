package recursionList3.views;

import recursionList3.controllers.exercise4;

public class controllerExec4 {

    public static void main(String[] args) throws InterruptedException {

        exercise4 exercise4 = new exercise4();

        String convertToBinary = exercise4.convertToBinaryString(50505);

        System.out.println("Int em binario: " + convertToBinary);
    }

}