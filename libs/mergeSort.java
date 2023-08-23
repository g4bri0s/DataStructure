package libs;

public class mergeSort {
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            sort(array, low, mid);
            sort(array, mid + 1, high);

            merge(array, low, mid, high);
        }
        return array;
    }

    private void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = array[j];
                k += 1;
                j += 1;
            }
        }

        while (i <= mid) {
            temp[k] = array[i];
            k += 1;
            i += 1;
        }

        while (j <= high) {
            temp[k] = array[j];
            k += 1;
            j += 1;
        }

        for (i = low; i <= high; i += 1) {
            array[i] = temp[i - low];
        }
    }
}
