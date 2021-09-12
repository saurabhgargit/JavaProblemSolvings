package array;

import java.util.Scanner;

public class MinAndMaxArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element");
//        int noOfEle = sc.nextInt();
//        int arr[] = new int[noOfEle];
        int arr[] = {5, -2, -19, 8, 15};
        int min = arr[0];
        int max = arr[1];

//        for(int i=0; i<arr.length;i++){
//            System.out.println("enter "+i+"th element");
//            arr[i] = sc.nextInt();
//        }
        //[5, -2, -19, 8, 15]
        for(int j=0; j<arr.length-1; j++){
            if(min>arr[j+1]){
                max = min;
                min = arr[j+1];
            }
        }
        System.out.print(min +" " +max);

    }
}
