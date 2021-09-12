package array;

public class ProductOfArrayExceptSelf {

    /*
    * https://leetcode.com/problems/product-of-array-except-self/
    * */

    public static void main(String[] args) {

        int[] arr = {1,2,3,12,4};

        int []d = productArray(arr);

        for(int k =0; k<d.length;k++){
            System.out.println(d[k]);
        }

    }

    public static int[] productArray(int num[]){

        int arr[] = new int[num.length];

        int a = 1;

        for(int i=0; i<num.length;i++){
            a = 1;
            for(int j=0; j<num.length;j++){
                if(i!=j){
                    a *=num[j];
                }
            }
            arr[i]=a;
        }
        return arr;
    }
}
