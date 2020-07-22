package array;

public class RemoveElement {

    public static void main(String[] args) {

        /*
        * Remove the given element from array
        * <a href='https://leetcode.com/problems/remove-element/'
        * */

        int arr[] = {2,3,4,3,8,9,12,3,4};
        int val = 3;
        removeElement(arr, val);
    }

    public static int removeElement(int nums[], int val){

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
            }
    }
        System.out.println("printing array");
            for(int k=0;k<i;k++)
                System.out.println(nums[k]);
        return i;

    }
}
