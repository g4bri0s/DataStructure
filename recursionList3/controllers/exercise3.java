package recursionList3.controllers;

public class exercise3 {

    public exercise3() {
        super();
    }

    public String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}