/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode before = null;
        ListNode t = head;
        for (int i = 1; i < left; i++) {
            before = t;
            t = t.next;
        }
        ListNode curr = t;
        ListNode prev = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        t.next = curr;
        if (before == null) {
            return prev;
        }
        before.next = prev;
        return head;
    }
}