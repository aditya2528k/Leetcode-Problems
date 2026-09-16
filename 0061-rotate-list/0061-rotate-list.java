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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        int node = 1;
        while(temp != null && temp.next != null){
            temp = temp.next;
            node++;
        }
        k = k % node;
        if(k == 0){
            return head;
        }
        int c = node - k;
        ListNode t = head;
        int count  = 1;
        while(count < c){
            t = t.next;
            count++;
        }
        ListNode res = t.next;
        temp.next = head;
        t.next = null;
        return res;
    }
}