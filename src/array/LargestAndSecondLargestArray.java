package array;

public class LargestAndSecondLargestArray {

    public static void main(String[] args) {
        int arr[] =  {8,-2,-5};

        findLargest(arr);
    }

    static void findLargest(int arr[]){

        int first =  arr[0];  //18
        int second = arr[1];  //2

        if(second>first){
           first = arr[1];
           second = arr[0];

        }


        for(int i=2; i<arr.length; i++){

            if(arr[i]>first){
                second = first;
                first = arr[i];

            }
            else if(arr[i]>second){
                second = arr[i];
            }


        }
        System.out.println(first +" "+second);

    }

}
