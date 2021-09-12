package maths;

import java.util.Scanner;

public class SquareSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        long arr[] = new long[tc];
        for(int i=0; i<tc;i++){
            long number = sc.nextLong();
            arr[i] = number;
        }

        for(int i=0; i< arr.length;i++){
            int sum =0;
            for(int j=1; j<=arr[i];j++){
                int p = j*j;
                sum = sum+p;
            }
            System.out.println(sum);
        }
    }
}
