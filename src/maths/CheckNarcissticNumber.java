package maths;

import java.util.Scanner;

public class CheckNarcissticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int sum = 0;

        int number = Integer.parseInt(s);
        for(int i=0; i<length;i++){
            int n = s.charAt(i)-48;
            int power = (int) Math.pow(n,length);
            sum = sum+power;
        }
        System.out.println("sum is="+sum);

        if(number==sum){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
