package msq;

public class ReverseANumber {

    /*
    * https://leetcode.com/problems/reverse-integer/
    * */

    public static void main(String[] args) {
       System.out.println(reverseNumber(1534756756));

        System.out.println(Integer.MAX_VALUE);
                 System.out.println(Integer.MIN_VALUE);
    }

    static int reverseNumber(int x){
        long reversed = 0, sign =1;
        int temp = x;


        if(x<0){
            temp = Math.abs(x);
            sign = -1;
        }


        while(temp!=0){

            int rem = temp%10;
            reversed = reversed * 10 + rem;
            temp /= 10;
        }

        if(reversed * sign >= Integer.MAX_VALUE || reversed * sign <= Integer.MIN_VALUE )
            return 0;

         return (int)(reversed * sign);
    }
}
