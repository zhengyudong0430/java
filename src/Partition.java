import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
    ListNode as = null;
    ListNode ae = null;
    ListNode bs = null;
    ListNode be = null;
    ListNode cur = pHead;
    while (cur!=null) {
        if(cur.val<x) {
            if(as==null) {
                as = cur;
                ae = as;
            }else {
                ae.next = cur;
                ae = ae.next;
            }
        }else {
            if(bs == null) {
                bs = cur;
                be = bs;
            }else {
                be.next = cur;
                be = be.next;
            }
        }
        cur = cur.next;
    }
    if(as==null) {
        return bs;
    }
    if(bs==null) {
        return as;
    }
    be.next = null;
    ae.next = bs;
    return as;
    }
}