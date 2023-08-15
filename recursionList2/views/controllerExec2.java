package recursionList2.views;

import recursionList2.controllers.exercise2;

public class controllerExec2 {

    public static void main(String[] args) throws InterruptedException {

        exercise2 exercise2 = new exercise2();

        int dividingSubtractions = exercise2.dividingSubtractions(21, 5);

        System.out.println("Divisão de 21 por 5: " + dividingSubtractions);
    }

}
