package recursionList2.controllers;

public class exercise3 {

    public exercise3() {
        super();
    }

    public int positivesArray(int[] a, int b) {

        // quando o b chegar em 0, a recursão termina
        if (b <= 0 || a[b] %2 == 0) {
        	return ((a[b] %2 == 0)? 1 : 0) + positivesArray(a, b-1);
        }
        	return 0 + positivesArray(a, b-1);
    }
}