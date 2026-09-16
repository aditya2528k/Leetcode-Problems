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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
         ListNode before = null;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            ListNode after = next.next;
            next.next = curr;
            curr.next = after;
            if (before == null) {
                head = next;
            } else {
                before.next = next;
            }
            before = curr;
            curr = after;
        }
        return head;
    }
}