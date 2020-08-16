package string;

public class StringPermutations {

    public static void main(String args[]) {
        permutation("123");
    }

    public static void permutation(String input){
        permutation("", input);
    }


    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            System.out.println("before loop word is="+word);
            for (int i = 0; i< word.length(); i++) {
                System.out.println("I am in loop="+i+"  word is=="+word);
                System.out.println("perm & word="+perm + word.charAt(i));
                System.out.println("word substring="+word.substring(0, i) + word.substring(i + 1));
                permutation(perm + word.charAt(i), word.substring(0, i)
                                        + word.substring(i + 1));
                System.out.println("I am in loop later="+word);
            }
            System.out.println("After loop word is="+word);
        }

    }

}
