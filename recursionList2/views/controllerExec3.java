package recursionList2.views;

import recursionList2.controllers.exercise3;

public class controllerExec3 {

    public static void main(String[] args) throws InterruptedException {
    	
    	int[] arr = {55, 5, 8, 9, 46, 25, 81};
    	
    	int size = arr.length-1;
    
        exercise3 exercise3 = new exercise3();

        int positivesArray = exercise3.positivesArray(arr, size);

        System.out.println("Pares no vetor: " + positivesArray);
    }

}