package leetcode.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode.util.ListNode.newList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeTest {

    @Test
    void testNewList() {
        int[] arr = {0, 1, 2, 3, 4};
        ListNode actual = newList(arr);
        for (int i : arr) {
            assertEquals(i, actual.val);
            actual = actual.next;
        }
    }

    @Test
    void testToString() {
        int[] arr = {0, 1, 2};
        ListNode list = newList(arr);
        String actual = list.toString();
        String expect = "0->1->2";
        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @MethodSource(value = "assertListNodeEqualsParams")
    void assertListNodeEquals(ListNode a, ListNode b, boolean expect) {
        boolean actual = ListNode.assertListNodeEquals(a, b);
        assertEquals(expect, actual);
    }

    public static Stream<Arguments> assertListNodeEqualsParams() {
        return Stream.of(
                Arguments.of(newList(1, 2, 3), newList(1, 2, 3), true),
                Arguments.of(newList(1, 2, 3), newList(1, 2), false),
                Arguments.of(newList(), newList(), true),
                Arguments.of(newList(1, 2, 3), newList(), false)
        );
    }

}