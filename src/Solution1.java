/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode middleNode(ListNode head) {
      ListNode front = head;
      ListNode after = head;
      while (front!=null) {
          front = front.next.next;
          after = after.next;
      }
      return after;
    }
}