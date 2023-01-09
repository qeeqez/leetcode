package com.qeeqez.utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static boolean isSameList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2 == null;
        }
        if (head2 == null) {
            return false;
        }
        return (head1.val == head2.val) && isSameList(head1.next, head2.next);
    }

    /**
     * Construct a linked list using given integer array.
     *
     * @param nums input integer array
     * @return head node of the constructed list
     */
    public static ListNode constructLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for (int num : nums) {
            node.next = new ListNode(num);
            node = node.next;
        }
        return dummy.next;
    }
}
