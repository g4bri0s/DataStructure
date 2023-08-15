package recursionList2.controllers;

public class exercise2 {

    public exercise2() {
        super();
    }

    public int dividingSubtractions(int a, int b) {

        // quando o a for menor que b, a recurs�o para
        if (b > a ) {
            return 0;
        }
        // a recusão é chamada novamente, decrementando o b
        return 1 + dividingSubtractions(a, b - a);
    }
}