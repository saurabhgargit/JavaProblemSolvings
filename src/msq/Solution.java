package msq;

class Solution {


    public static void main(String[] args) {
        System.out.println(reverse(1534756756));
    }


   public static int reverse(int x) {
		int sign = 1;
		int temp = x;
		if (x < 0) {
			temp = Math.abs(x);
			sign = -1;
		}
		long ans = 0;
		while (temp != 0) {
			int rem = temp % 10;
			ans = ans * 10 + rem;
			temp /= 10;
		}
		if (ans * sign <= Integer.MIN_VALUE || ans * sign >= Integer.MAX_VALUE) {
			return 0;
		}
		return (int) (ans * sign);
	}
}
