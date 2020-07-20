package array;

public class RotateArray {

    public static void main(String[] args) {

        int  arr[]  = {1,2,3,4,5,6,7};
        int  k = 3;

        rotateArray(arr,k);


    }


    public static  void  rotateArray(int arr[], int num){
        int previous = 0, temp = 0;
        while(num>0){

            previous = arr[arr.length-1];
            for(int i=0;i<arr.length;i++){
                temp = arr[i];
                arr[i]=previous;
                previous=temp;
            }
            num--;
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }


    }
}
