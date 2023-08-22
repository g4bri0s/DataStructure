public class quickSort{
	
	public void quickSort() {
		super();
	};
	
	
	public int[] sort(int[] vector, int init, int end) {

		int indexPivo = divide(vector, init, end);
		
		sort(vector, init, indexPivo -1);
		
		sort(vector, indexPivo+1, end);
	};
	
	private int divide (int[] vector, int init, int end) {
		int pivo = vector[init];
		int pointL = init + 1;
		int pointR = end;
		
		while(pointL <= pointR) {
			while(pointL <= pointR && vector[pointL] <= pivo) {
				pointL++;
			}
		
			while (pointR >= pointL && vector[pointR] > pivo) {
				pointR--;
			}
		
			if(pointL < pointR) {
				change(vector, pointR, pointL);
				pointL++;
				pointR--;
			}
		}
		
		change(vector, init, pointR);
		return pointR;
	};
	
	private void change (int[] vector, int i, int j) {
		int temp = vector[i];
		vector[i] = vector[j];
		vector[j] = temp;
	};
	
}