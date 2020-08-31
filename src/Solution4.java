/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution4 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode node = new ListNode(0);
        ListNode cur = pHead;
        ListNode tmp = node;
        while (cur!=null) {
            if(cur.next!=null&&cur.val==cur.next.val) {
                while (cur.next!=null&&cur.val==cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }
            else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next=null;
        return node.next;
    }
}