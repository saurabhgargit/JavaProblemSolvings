package matrix;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int mat[][] = new int[n][m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("printing matrix");

//        for(int i=0; i<n;i++){
//            int ans =0;
//            ans = sum(mat[i]);
//            System.out.println("sum is="+ans);
//        }

    }

    private static int sum(int[] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum+mat[i];
        }
        return sum;
    }
}
