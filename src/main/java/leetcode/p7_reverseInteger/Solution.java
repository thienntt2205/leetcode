package leetcode.p7_reverseInteger;

public class Solution {
    public int reverse(int x) {
        int tag = 0;
        if (x < 0) {
            tag = 1;
            x = 0 - x;
        }
        long res = 0;
        while (x > 0) {
            int tail = x % 10;
            res = res * 10 + tail;
            x = x / 10;
        }
        if (tag == 1) res = 0 - res;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) res = 0;
        return (int) res;
    }
}
