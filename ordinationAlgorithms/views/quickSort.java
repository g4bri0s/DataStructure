package ordinationAlgorithms.controllers;

import ordinationAlgorithms.controllers.quickSort;

public class quickSort{

	public static void main() {
		
		int vector[] = {24, 66, 87, 43, 11, 27, 4, 2, 7, 8, 4, 5,
			     12, 53, 42, 22, 1, 5, 9, 13, 16, 23, 13, 7, 55, 67,
			     92, 22, 33, 27, 19};
		
		quickSort quickSort = new quickSort;
		
		quickSort.sorte(vector, 0, vector.lenght -1);
		
	};
	
}