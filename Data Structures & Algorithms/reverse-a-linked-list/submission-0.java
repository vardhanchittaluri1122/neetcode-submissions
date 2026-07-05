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
    public ListNode reverseList(ListNode head) {
        ListNode copy=head;
        ListNode pre=null;
        while(copy !=null){
            ListNode temp=copy.next;
            copy.next=pre;
            pre=copy;
            copy=temp;
        }
        return pre;
    }
}
