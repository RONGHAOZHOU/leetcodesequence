package two;

import util.ListNode;

public class TwoExtend {

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

    //递归解
    private static ListNode addTowNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int carry = getSum(l1, l2, head);
        if (carry > 0) {//头节点有进位，返回包含头节点的结果
            head.val = 1;
            return head;
        } else {
            return head.next;//头节点无进位，返回头节点的下一节点为结果
        }
    }

    /***
     *
     * @param node1 本次递归相加的两个节点
     * @param node2
     * @param head 假头部
     * @return 是否进位
     */
    private static int getSum(ListNode node1, ListNode node2, ListNode head) {
        int carry = 0;
        if (node1.next != null && node2.next != null) {
            carry = getSum(node1.next, node2.next, head); //都不为空直接都取下一个节点求递归
        } else if (node1.next == null && node2.next!=null) {
            carry = getSum(new ListNode(0), node2.next, head); //其中一个不为空，一个为空，则为空的使用0节点补齐
        } else if (node1.next != null) {
            carry = getSum(node1.next, new ListNode(0), head);
        }
        //都为空时不再递归，计算该节点的值，返回是否进位给上一层递归调用，新增节点使用前插入法插入
        ListNode newNode = new ListNode((node1.val+node2.val+carry) % 10);
        newNode.next = head.next;
        head.next = newNode;
        return (node1.val+node2.val) / 10;
    }
}
