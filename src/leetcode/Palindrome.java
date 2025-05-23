package leetcode;

public class Palindrome {


    /**
     * Simple function to check if given number is a palindrome using StringBuilder
     * @param num to be examined
     * @return true or false
     */
    public static boolean isPalindromeSimple(int num) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(num);
        sb2.append(num);
        sb.reverse();
        return sb.toString().contentEquals(sb2);
    }


    public static boolean isPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        // TODO:

        return false;
    }


    /// negative number cant be a palindrome
    /// 354 % 10 = 4
    /// 4
    ///
    /// 35 % = 5
    /// 45
    ///
    public static void main(String[] args) {
        int first = 101;    //true
        int second = 1919;  //false
        int third = 25052;  //true
        int fourth = -101;  //false

        System.out.println(isPalindromeSimple(first));
        System.out.println(isPalindromeSimple(second));
        System.out.println(isPalindromeSimple(third));


    }
}
