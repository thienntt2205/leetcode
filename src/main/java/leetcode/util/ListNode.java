package leetcode.util;

public class ListNode {
    int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode tail(){
        ListNode cur = this;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }

    /**
     * Example:
     * - Many elements: 1->2->3->...
     * - 1 element: 8
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.val);
        ListNode temp = this.next;
        while (temp != null) {
            result.append("->").append(temp.val);
            temp = temp.next;
        }
        return result.toString();
    }

    /**
     * newList creates a ListNode that contains the given numbers in their order.
     * If the input is empty, this return null.
     * <p>
     * Example: newList(1,2,3) returns 1->2->3
     */
    public static ListNode newList(int... arr) {
        ListNode preHead = new ListNode();
        ListNode pre = preHead;

        for (int x : arr) {
            pre.next = new ListNode(x);
            pre = pre.next;
        }
        return preHead.next;
    }

    public static boolean assertListNodeEquals(ListNode a, ListNode b) {
        while (a != null && b != null) {
            if (a.val != b.val) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return a == b;
    }
}

