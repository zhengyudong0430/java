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
class Solution3 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         if(l1==null) {
             return l2;
         }
         if(l2==null) {
             return l1;
         }
         if(l1==null&&l2==null) {
             return null;
         }
         ListNode newhead = new ListNode(1);
         ListNode cur = newhead;
         while (l1!=null&&l2!=null) {
             if(l1.val<l2.val) {
                 cur.next = l1;
                 cur = cur.next;
                 l1 = l1.next;
             }else {
                 cur.next = l2;
                 cur = cur.next;
                 l2 = l2.next;
             }
         }
         if(l1!=null) {
             cur.next = l1;
         }
         if(l2!=null) {
             cur.next = l2;
         }
         return newhead.next;
    }
}