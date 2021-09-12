package string;

public class ReverseString {

    public static void main(String[] args) {


        System.out.println("using recursion="+reverseStrRecursion("India"));

    }


    /*
    * Reverse a string using recursion
    *
    * */

    static String reverseStrRecursion(String str){

        if((null==str) || (str.length()<=1)){
            return str;
        }
        return reverseStrRecursion(str.substring(1)) + str.charAt(0);

    }
}
