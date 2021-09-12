package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {2, 7, 5, 12, 4, -3, 8, -1};

        for (int j = 0; j <arr.length ; j++) {
            for(int i=0; i<arr.length-1-j; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }


        System.out.println("printing");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


}
