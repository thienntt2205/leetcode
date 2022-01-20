package leetcode.p83_remove_duplicate_from_sorted_list;

import leetcode.util.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Corner case
        if (head == null || head.next == null) return head;

        // Compare current node with next node
        // If the same, skip next node
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
