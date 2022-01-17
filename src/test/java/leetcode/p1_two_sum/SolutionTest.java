package leetcode.p1_two_sum;

import leetcode.p1_twosum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void twoSum() {
        Solution test = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expect = {0, 1};
        int[] actual = test.twoSum(nums, target);
        assertArrayEquals(expect, actual);
    }


}