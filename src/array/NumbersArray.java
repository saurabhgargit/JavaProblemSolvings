package array;

public class NumbersArray {

    public static void main(String[] args) {
        int arr[] =  {1,0,0,1,0,1,1};

        sortingArray(arr);
    }

    static void sortingArray(int arr[]){
        int count =0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==1){
               count++;
            }
        }

        for(int j=0 ; j< arr.length; j++){
            arr[j] = 1;
            arr[arr.length-count-j] = 0;
        }
//        for(int k=count; k< arr.length;k++){
//            arr[k] = 0;
//        }

        System.out.println("printing");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
