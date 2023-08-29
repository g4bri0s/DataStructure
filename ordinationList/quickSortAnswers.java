package ordinationList;

import utils.src.quickSort;

public class quickSortAnswers {
    public static void main(String[] args) {

        quickSort quickSort = new quickSort();

        int[] vector1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        int[] vector2 = { 44, 43, 42, 41, 40, 39, 38 };

        System.out.println("Vector 1:" + "\n Before: " + java.util.Arrays.toString(vector1));
        quickSort.sort(vector1);
        System.out.println(" After: " + java.util.Arrays.toString(vector1));

        System.out.println("\nVector 2:" + "\n Before: " + java.util.Arrays.toString(vector2));
        quickSort.sort(vector2);
        System.out.println(" After: " + java.util.Arrays.toString(vector2));
    }
}
