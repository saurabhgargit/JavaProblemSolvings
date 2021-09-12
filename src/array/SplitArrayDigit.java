package array;

import java.util.*;

public class SplitArrayDigit {

    public static void main(String[] args) {

        int []arr1 = {23,5,1};
        int []arr2 = {28,18,36,70,801};

        int leng = Math.max(arr1.length,arr2.length);
        int sumArray[] = new int[leng];

        for(int i=0;i<leng;i++){
            if(i<arr1.length && i<arr2.length)
                sumArray[i]  = arr1[i]+arr2[i];
            else if(i>=arr1.length || i>arr2.length)
                if(arr2.length>arr1.length)
                    sumArray[i] = arr2[i];
                else
                    sumArray[i] = arr1[i];
        }
        List<Integer> d  = new ArrayList<Integer>();
         for(int j:sumArray){
            d.addAll(digits(j));
        }

         System.out.println("modified list="+d);
    }

    public static  List<Integer> digits(int i) {
    List<Integer> digits = new ArrayList<Integer>();
    while(i > 0) {
        digits.add(i % 10);
        i /= 10;
    }
    Collections.reverse(digits);
    return digits;
    }
}
