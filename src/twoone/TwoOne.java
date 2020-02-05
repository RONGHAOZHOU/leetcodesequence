package twoone;

import util.ListNode;

public class TwoOne {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);


        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) { //如果其中至少一个为空，则返回可能不为空的那个
            return l1 == null ? l2 : l1;
        }
        ListNode result = new ListNode(0);
        ListNode current = result;
        while (l1 != null) {
            if (l2 == null ) {
                current.next = l1;
                return result.next;
            } else if (l1.val <= l2.val) {
                current.next = new ListNode(l1.val);
                current = current.next;
                l1 = l1.next;
            } else {
                current.next = new ListNode(l2.val);
                current = current.next;
                l2 = l2.next;
            }
        }
        current.next = l2;
        return result.next;
    }
}
