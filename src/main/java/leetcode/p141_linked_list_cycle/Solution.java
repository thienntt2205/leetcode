package leetcode.p141_linked_list_cycle;

import leetcode.util.ListNode;

import java.util.HashSet;
import java.util.Set;

//to do, refine code to speedup
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (seen.contains(head)) {
                return true;
            }
            seen.add(head);
            head = head.next;

        }

        return false;
    }
}
