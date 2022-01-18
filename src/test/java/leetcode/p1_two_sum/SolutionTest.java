package leetcode.p1_two_sum;

import leetcode.p1_twosum.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
//    @Test
//    void twoSum() {
//        Solution test = new Solution();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] expect = {0, 1};
//        int[] actual = test.twoSum(nums, target);
//        assertArrayEquals(expect, actual);
//    }

    //    @ParameterizedTest(name = "#{index} - Test with String : {0}")
    @ParameterizedTest
    @MethodSource("intProvider")
    void test_method_int(int[] arg, int target, int[] expect) {
        Solution check = new Solution();
        int[] actual = check.twoSum(arg, target);
        assertArrayEquals(expect, actual);

    }

    static Stream<Arguments> intProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 8, 9, 10}, 9, new int[]{0, 1}),// each Stream.of only for 1 input,
                Arguments.of(new int[]{5, 2, 4, 7, 0}, 5, new int[]{0, 4}),
                Arguments.of(new int[]{5, 2, 4, 7, 0}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{5, 2, 4, 7, 0}, 11, new int[]{2, 3}),
                Arguments.of(new int[]{5, 2, 4, 7, 0}, 7, new int[]{0, 1}),
                Arguments.of(new int[]{5, 2, 4, 7, 0}, 99, new int[]{0,0})
        );
    }

}