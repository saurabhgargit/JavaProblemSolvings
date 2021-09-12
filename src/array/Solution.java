package array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
            else{
                map.put(arr.get(i),1);
            }
        }
        int maxValue =0;
        int minKey = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet())   {
            if(entry.getValue()>maxValue){
                maxValue = entry.getValue();
                minKey = entry.getKey();
            }
        }
        return minKey;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int key = Result.migratoryBirds(Arrays.asList( 3,1, 2,  4, 5, 4, 2, 1, 3, 3,4));
        System.out.println(key);
    }
}
