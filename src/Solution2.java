/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution2 {
    public ListNode FindKthToTail(ListNode head,int k) {
          if(head==null) {
              return null;
          }
          if(k<=0) {
              return null;
          }
          ListNode fast = head;
          ListNode slow = head;
          while (k-1>0) {
              if(fast.next!=null) {
                  fast = fast.next;
                  k--;
              }
              else {
                  return null;
              }
          }
          while (fast.next!=null) {
              fast = fast.next;
              slow = slow.next;
          }
          return slow;
    }
}