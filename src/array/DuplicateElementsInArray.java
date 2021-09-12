package array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElementsInArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        printDuplicate(arr);
    }
    public static void printDuplicate(int arr[]){
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        boolean dup = false;
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            // if frequency is more than 1
            // print the element
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+ " ");
                dup = true;
            }
        }
        // no duplicates present
        if(!dup){
            System.out.println("-1");
        }
    }
}
