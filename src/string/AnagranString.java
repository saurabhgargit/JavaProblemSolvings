package string;

public class AnagranString {

    public static void main(String[] args) {

      //  checkAnagram("Mother In Law", "Hitler Woman");
        checkAnagram("Toss", "Shot");
       //  checkAnagram("keep","peek");

    }

    static void checkAnagram(String s1, String s2){

        String copyS1 = s1.replaceAll("\\s+","").toLowerCase();
        String copyS2 = s2.replaceAll("\\s+","").toLowerCase();

        boolean status = true;

       // System.out.println("hello".replaceFirst("e",""));



        if(copyS1.length() != copyS2.length())
           status =  false;

        char[] s1ToArray = copyS1.toCharArray();

        for(char c:s1ToArray){
            if(copyS2.indexOf(c)!=-1){
                System.out.println("String.valueOf(c)"+String.valueOf(c));
                 System.out.println("Character.valueOf(c)"+Character.valueOf(c));
                  System.out.println("String.valueOf(c)"+String.valueOf(c));
                copyS2.replaceFirst(String.valueOf(c),"");
                System.out.println("value of copy s2 is="+copyS2);
            }
            else{
                status = false;
                break;
            }
        }

        if(status)
            System.out.println(s1+" and "+s2+"  are anagrams");
        else
            System.out.println(s1+" and "+s2+" not anagram");






    }
}
