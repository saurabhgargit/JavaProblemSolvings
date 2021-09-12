package array;

public class RemoveDuplicate {

    /*
    * remove duplicate from sorted array
    * */

    public static void main(String[] args) {
            int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
            int n = arr.length;
            removeDuplicate(arr);


    }

    static int removeDuplicate(int nums[]){
//
      if(nums.length  == 0)
            return 0;
         int j=1;
        int b = nums[0];
        for(int i=1; i<nums.length;i++){
             if (nums[i] != b) {

               b  = nums[i];
               nums[j] = nums[i];//123
                j++;

           }
        }
        return j;

    }
}
