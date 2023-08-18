package recursionList2.views;

import recursionList2.controllers.exercise2;

public class controllerExec2 {
    public static void main(String[] args) throws InterruptedException {

        exercise2 exercise2 = new exercise2();

        int dividingSubtractions = exercise2.dividingSubtractions(10, 3);

        System.out.println("Dividindo 10 por 3: " + dividingSubtractions);
    }
}
