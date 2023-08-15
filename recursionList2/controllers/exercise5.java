package recursionList2.controllers;

public class exercise5{

    public exercise5() {
        super();
    }

    public int mdc(int a, int b) {

        // se a e b foram 1, função retorna 1;
        if (a == 1 && b == 1) {
            return 1;
        }
       
        if (a == b ) {
        	return a;
        }
        
        if (a > b) {
        	return mdc(a-b, b);
        }
        
        if(b > a) {
        	return mdc(b-a, a);
        }
        
        return b*a;
        
        
    }
}