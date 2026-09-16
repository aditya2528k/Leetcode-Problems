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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode left = head;
        ListNode prevleft = null;
        ListNode res = null;

        while (left != null) {
            ListNode right = left;
            int count = 1;

            while (count < k && right != null) {
                right = right.next;
                count++;
            }
            if (right == null) {
                if (prevleft != null) {
                    prevleft.next = left;
                }
                break;
            }
            ListNode nextleft = right.next;
            ListNode curr = left;
            ListNode prev = null;
            int size = k;
            while (size > 0) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                size--;
            }
            if (prevleft != null) {
                prevleft.next = prev;
            } else {
                res = prev;
            }
            left.next = nextleft;
            prevleft = left;
            left = nextleft;
        }
        return res;
    }
}