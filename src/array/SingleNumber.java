package array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {

    /*
     * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
     * */

    public static void main(String[] args) {

        System.out.println(returnSingleNumber(new int[]{ 4,1,2,1,2 }));

    }


    public static  int returnSingleNumber(int num[]){

        HashMap<Integer,Integer> map  = new HashMap<>();

        for(int i=0;i<num.length;i++){
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }
            else{
                map.put(num[i],1);
            }
        }

        //Iterating using iterators over Map.Entry<K, V>
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer, Integer> entry = itr.next();
            if(entry.getValue()==1)
                return entry.getKey();


        }
        return 0;

    }




}
