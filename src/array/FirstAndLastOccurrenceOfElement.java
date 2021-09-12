package array;

import java.util.Arrays;

public class FirstAndLastOccurrenceOfElement {

    public static void main(String[] args) {

        int arr[] = {2,3,5,7,7,7,7,7,9};
        int target = 71;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    public static int[] searchRange(int nums[], int target){
        int arr[] = {-1,-1};

        int start = findOccurrence(nums,target,true);
        int end = findOccurrence(nums,target,false);
        arr[0]  = start;
        arr [1] = end;
        return arr;

    }



    public static int findOccurrence(int arr[], int target, boolean firstOccurrence){

        int start = 0, end = arr.length-1, ans = -1 ;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid])
                start = mid+1;
            else {
                ans = mid;
                if (firstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
