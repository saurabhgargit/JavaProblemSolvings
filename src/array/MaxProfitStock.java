package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxProfitStock {

    public static void main(String[] args) {

        int arr[] = {3,19,31};
        getMaxProfit(arr);

    }


    public static int maxProfit(int arr[]){
        int diff = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    diff = arr[j]-arr[i];
                    list.add(diff);
                }
            }

        }
        if(list.size()==0) {
            return 0;
        }
        return Collections.max(list);

    }

    public static int maxProfit1(int[] prices) {
        int n=prices.length;
        if(n==0||n==1)
            return 0;
        int p=0;   //profit
        int min=prices[0];
        for(int i=1;i<n;i++)
        {
            if(prices[i]-min>p)
                p=prices[i]-min;

            if(min>prices[i])
                min=prices[i];
        }
        System.out.println(p);
        return p;
        }

        public static int getMaxProfit(int[] prices){        //2,3,4,9 OR 3,2,4,9

            if(prices.length ==0)
                return 0;
            int minPrice = prices[0], maxProfit=0;
            for(int i=1; i<prices.length;i++){
                if(minPrice>prices[i])
                    minPrice  = prices[i];
                else{
                    if(maxProfit < prices[i]-minPrice)
                        maxProfit = prices[i]-minPrice;
                }
            }
            System.out.println(maxProfit);
            return maxProfit;

        }


}
