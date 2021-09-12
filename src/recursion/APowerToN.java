package recursion;

public class APowerToN {

    public static void main(String[] args) {
        System.out.println(powerToN(5,10));
    }

    public static int powerToN(int a, int n){

        if(n==0)
            return 1;

        int y = powerToN(a,n/2);

        if(n%2==0)
            return y * y;

        return a * y * y;
    }
}
