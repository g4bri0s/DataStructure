package ordinationList;

import utils.src.mergeSort;

public class mergeSortAnswers {
    public static void main(String[] args) {
        mergeSort mergeSort = new mergeSort();

        int[] vector1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        int[] vector2 = { 44, 43, 42, 41, 40, 39, 38 };

        System.out.println("Vector 1:" + "\n Before: " + java.util.Arrays.toString(vector1));
        mergeSort.sort(vector1);
        System.out.println(" After: " + java.util.Arrays.toString(vector1));

        System.out.println("\nVector 2:" + "\n Before: " + java.util.Arrays.toString(vector2));
        mergeSort.sort(vector2);
        System.out.println(" After: " + java.util.Arrays.toString(vector2));
    }
}
