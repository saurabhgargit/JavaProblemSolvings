package string;

public class RevStringWithoutReversingSpecialChar {

    /*
    * Reverse  the String without changing the position of special character
    * */


    public static void main(String[] args) {

        String s = "S@ur@bh";

        char []chArray  = s.toCharArray();

        int l =0, r= s.length()-1;

        while (l<r){
            if(!Character.isAlphabetic(chArray[l]))
                l++;
            else if(!Character.isAlphabetic(chArray[r]))
                r--;
            else {
                char temp = chArray[l];
                chArray[l] = chArray[r];
                chArray[r] = temp;
                l++;
                r--;

            }

        }
        System.out.print(chArray);

    }




}
