package libs;

public class quickSort {

	public int[] sort(int[] array) {
		return sort(array, 0, array.length - 1);
	}

	private int[] sort(int[] array, int low, int high) {
		if (low < high) {
			int pi = divide(array, low, high);
			sort(array, low, pi - 1);
			sort(array, pi + 1, high);
		}
		return array;
	}

	private int divide(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low - 1);

		while (low < high) {
			if (array[low] <= pivot) {
				i++;
				swap(array, i, low);
			}
			low++;
		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}