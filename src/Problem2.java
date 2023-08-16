import java.util.Arrays;

public class Problem2 {
    // Problem Link: https://leetcode.com/problems/palindrome-number/

    public static void main(String[] args) {
        boolean ans = Problem2.palindromeNumber(424);
        System.out.println(ans);
    }

    static boolean palindromeNumber(int x) {
        int temp = x;
        if (x < 0) {
            return false;
        } else {
            int rev_x = 0;
            while (temp != 0) {
                int last_dig = temp % 10;
                rev_x = (rev_x * 10) + last_dig;
                temp = temp / 10;
            }
            return rev_x == x;
        }
    }
}
