package recursionList2.controllers;

public class exercise1 {

    public exercise1() {
        super();
    }

    public int multiplieSums(int a, int b) {

        // quando o b chegar a 0, a recurss�o para
        if (b <= 0) {
            return 0;
        }
        // a recusão é chamada novamente, decrementando o b
        return a + multiplieSums(a, b - 1);
    }
}