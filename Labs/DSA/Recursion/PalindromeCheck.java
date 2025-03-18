public class PalindromeCheck {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static boolean checkPalindrome(String str, int s, int e) {
        if (s >= e) {
            return true;
        } else if (str.charAt(s) == str.charAt(e)) {
            return checkPalindrome(str, s + 1, e - 1);
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        if (n == 0) {
            return true;
        }
        return checkPalindrome(str, 0, n - 1);
    }

    public static int findMinEle(int A[], int n) {
        if (n == 1) {
            return A[0];
        } else {
            return Math.min(A[n - 1], findMinEle(A, n - 1));
        }
    }

    public static void main(String args[]) {
        System.out.println(reverseString("HELLO WORLD"));
        System.out.println();
        String str = "MADAM";
        if (isPalindrome(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not a palindrome");
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
        System.out.println(findMinEle(A, n));
    }
}
