package array;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {

    /*
    * https://leetcode.com/problems/contains-duplicate/submissions/
    * https://leetcode.com/problems/contains-duplicate-ii/
    * */

    public static void main(String[] args) {
        int[] arr = {1,2,3,12,4};
        System.out.println(checkDuplicate(arr));
    }

    public static boolean checkDuplicate(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
            s.add(arr[i]);
        System.out.println(s.size()+","+arr.length);

        if (s.size() == arr.length)
            return false;

        return true;
    }

    /*
    * https://leetcode.com/problems/contains-duplicate-ii/
    * */
    public static boolean checkDuplicate2(int[] arr, int k) {

        for(int i =0; i< arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j] && j-i<=k){
                    return true;
                }
            }
        }

        return false;
    }

}
