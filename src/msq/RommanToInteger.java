package msq;

public class RommanToInteger {

    public static void main(String[] args) {

        System.out.println("result is= "+returnInt("MXXXXXC"));
    }

    static int value(char c){

        if(c == 'I')
            return 1;
        if(c == 'V')
            return 5;
        if(c == 'X')
            return 10;
        if(c == 'L')
            return 50;
        if(c == 'C')
            return 100;
        if(c == 'D')
            return 500;
        if(c == 'M')
            return 1000;
        else
            return -1;

    }
    static int returnInt(String s){
        int result = 0;

        for (int i=0;i<s.length();i++){
            System.out.println("loop starting value of i is= "+i);
           int s1  = value(s.charAt(i));   //1
           if(i+1 <s.length()) {
               int s2 = value(s.charAt(i + 1));  //1
               if(s1>=s2)
                   result += s1;//XXXXIV
               else {
                   result = result + s2 - s1;
                   i++;
                    System.out.println("end of else  value of i is= "+i);
               }
               System.out.println("out of else  value of i is= "+i);

           }
           else{
               System.out.println("beginning  of 2 else  value of i is= "+i);
               result += s1;
               //i++;
               System.out.println("out of 2nd else  value of i is= "+i);

           }

        }
        return result;
    }
}
