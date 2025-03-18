public class Recursion {
    public boolean isSorted(int[] ar, int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (ar[n - 1] >= ar[n - 2]) {
            return isSorted(ar, n - 1);
        } else {
            return false;
        }
    }
}
