package leetcode.p141_linked_list_cycle;

import leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void hasCycle() {
        Solution check = new Solution();
        ListNode head = ListNode.newList(1, 2, 3);
        assertFalse(check.hasCycle(head));
        
        head.tail().next = head;
        assertTrue(check.hasCycle(head));
    }
}
