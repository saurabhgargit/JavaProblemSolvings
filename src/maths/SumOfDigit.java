package maths;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {

//        int n = 123;
//        int sum = 0;
//        int rem = 0;
//
//        while(n>0){
//            rem = n%10;
//            sum = sum+rem;
//            n = n/10;
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while(temp>0){
            n = n%10;
            sum = sum+n;
            temp = temp/10;
        }
        System.out.println(sum);

    }


}
