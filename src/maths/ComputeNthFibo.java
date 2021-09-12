package maths;

import java.util.Scanner;

public class ComputeNthFibo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1, c = 0;

//        if (n == 0) {
//            System.out.println(a);
//        }
//        if (n == 1) {
//            System.out.println(b);
//        } else {


            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
       // }
    }
}
