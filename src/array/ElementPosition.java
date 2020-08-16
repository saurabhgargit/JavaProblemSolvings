package array;

public class ElementPosition {


    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5};

        int element = 2;


        for(int i=0; i<arr.length;i++){
            if(element <arr[i]){
                System.out.println(i-1);
                break;

            }
        }
    }
}
