package array;

public class FindPairs {




    public static void main(String[] args) {
        int arr[] = {3,10, 8,2,7, -5,15, 8,1,12};

        for(int i=0;i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    System.out.println(arr[i] +" "+arr[j]);
                }
            }
        }
    }
}
