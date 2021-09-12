package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String[] args) {
        int arr[] = {2,1,1};
      //  printMajorityElements(arr);
        int majorityElement =  majorityElement(arr);
        System.out.println(majorityElement);

    }

    public static void printMajorityElements(int arr[]){
        int half = arr.length/2;

        Map<Integer, Integer> hm = new HashMap<>();

        for(int d:arr){
            int count = hm.containsKey(d)?hm.get(d)+1:1;
            hm.put(d,count);
        }
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>=half){
                System.out.println(entry.getKey());
            }
        }
    }

    //Method 2 using Boyer-Moore algo
        public static int majorityElement(int[] arr) {
            int count =0;
            Integer majority = null;

            for(int num: arr){
                if(count==0){
                    majority = num;
                }
                count += (num==majority)?1:-1;
            }
            return majority;

        }
}

/*
* public class Test {
    public static void main (String[] args) {
        Integer[] data = {6, 1, 2, 5, 5, 5, 5, 5, 7};
        Map<Integer, Integer> countMap = new HashMap<>();
        Integer majority = null;
        int halfSize = data.length/2;
        for (Integer element : data) {
            Integer count = (countMap.containsKey(element)) ? (countMap.get(element) + 1) : 1;
            countMap.put(element, count);
            if (count > halfSize) {
                majority = count;
            }
        }
        if (null != majority) {
            System.out.println("Majority element is: " + majority);
        } else {
            System.out.println("No Majority element found");
        }
    }
}
* */