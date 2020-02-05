package two;

import util.ListNode;

import java.util.Stack;

public class TwoExtend2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(2);


        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(5);

        ListNode result = addTowNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    //堆栈法
    private static ListNode addTowNumbers(ListNode l1, ListNode l2) {
        //用栈翻转元素顺序
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        //头节点
        ListNode head = new ListNode(0);
        while (l1 != null || l2 != null) {
            s1.push(l1 == null ? 0 : l1.val);
            s2.push(l2 == null ? 0 : l2.val);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        int carry = 0;
        while (!s1.isEmpty()) {
            int sum = carry + s1.pop() + s2.pop();
            ListNode tmp = new ListNode(sum % 10);
            tmp.next = head.next;
            head.next = tmp;
            carry = sum / 10;
        }
        if (carry > 0) {
            head.val = 1;
            return head;
        }
        return head.next;
    }
}
