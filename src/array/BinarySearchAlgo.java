package array;

import java.util.Arrays;

public class BinarySearchAlgo {

    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9,13};


       // Arrays.sort(arr);

        System.out.println(binarySort(arr,0,arr.length-1,5));



    }

    static int binarySort(int arr[], int l, int r, int x){

        if(r>l) {

            int mid = l + (r - l) / 2;


            if (arr[mid] == x) {        //2,5,6,3,9
                return x;
            } else if (arr[mid] < x) {
                return binarySort(arr, mid + 1, r, x);
            } else if (arr[mid] > x) {
                return binarySort(arr, l, mid - 1, x);
            }
        }

        return -1;
    }
}
