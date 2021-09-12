package maths;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long number = sc.nextLong();
            long temp = number;
            long sum = 0l;
            long a = 0l;
            while (number > 0) {
                a = number % 10;
                sum = sum + a;
                number = number / 10;
            }
            if (temp / sum == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

}
