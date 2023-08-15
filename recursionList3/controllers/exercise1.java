package recursionList3.controllers;

public class exercise1 {

    public exercise1() {
        super();
    }

    public int length(int a) {

        // quando o a chegar a 0, a recurssãoo para
        if (a <= 0) {
            return 0;
        }
        // a recusão é chamada novamente, decrementando o b
        return 1 + length(a/10);
    }
}