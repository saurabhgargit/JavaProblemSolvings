package pattern;

import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        clockPattern(n);


    }
    private static void clockPattern(int n){
        for (int i = 1; i <=n; i++) {
            for(int k=1; k<i;k++){
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 2; i<=n+1;i++){
            for(int j = i; j<=n ;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<i;k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void equilateralTriangle(int n){
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i;j=j+2)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern1(int n){
        for(int i=0; i<n;i++ ){
            for(int j=i; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n){
        for(int i=1; i<=n;i++){
            for(int k=i; k<=n;k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern3(int n){
        for(int i=n; i>=1;i-- ){
            if(i==1 || i==n){
                for(int j=1; j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1; j<=i;j++){
                    if(j==1 || j==i ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}
