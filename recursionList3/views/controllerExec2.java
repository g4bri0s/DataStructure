package recursionList3.views;

import recursionList3.controllers.exercise2;

public class controllerExec2 {

    public static void main(String[] args) throws InterruptedException {

        exercise2 exercise2 = new exercise2();

        int timesNAppeare = exercise2.timesIntAppears(21, 5);

        System.out.println("Vezes que b aparece em a: " + timesNAppeare);
    }

}
