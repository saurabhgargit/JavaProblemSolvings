package array;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        arrayRotation(arr, 2);
    }

    public static void arrayRotation(int arr[], int d){
        System.out.println("array length is="+arr.length);
        for(int i=0; i<d;i++){
            System.out.println(i+"th iteration");
            int temp = arr[0];
            for(int j=0; j<arr.length-1;j++){

                arr[j] = arr[j+1];
            }
                arr[arr.length-1] =temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
