package maths;

import java.util.Scanner;

public class CountMultipleOf5And3 {

    static void countOfMultiples(long n[])
    {

        // Add multiples of 3 and 5.
        // Since common multiples are
        // counted twice in n/3 + n/15,
        // subtract common multiples

        for(int i=0; i< n.length;i++) {
            System.out.println(n[i] / 3 + n[i] / 5 - n[i] / 15);
        }
    }

    // Driver Code
    static public void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        long arr[] = new long[tc];
        for(int i=0; i<tc;i++){
            long number = sc.nextLong();
            arr[i] = number;
        }
        countOfMultiples(arr);
    }


}
