package ru.klasix12;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode end = head;
        while (end.next != null) {
            end = end.next;
        }
        ListNode cur = head;
        while (cur != end) {
            ListNode next = cur.next;
            cur.next = end.next;
            end.next = cur;
            cur = next;
        }
        return end;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
