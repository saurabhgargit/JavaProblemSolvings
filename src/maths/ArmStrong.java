package maths;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            long a = sc.nextLong();
            long temp = a;
            long rem = 0l;
            long sum = 0l;
            while(temp > 0){
                rem = temp%10;
                sum = sum + (rem*rem*rem);
                temp = temp/10;
            }
            if(sum==a){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
