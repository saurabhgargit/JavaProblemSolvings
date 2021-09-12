package maths;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sumOfSeries = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<n;i++){
            int number = sc.nextInt();
            sum = sum+number;
        }
        sumOfSeries = sumOfSeries - sum;
        System.out.println(sumOfSeries);
    }

}
