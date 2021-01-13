package com.wzw.algo;

/**
 * 反转一个单链表。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class _206_反转链表 {

    /**
     * 通过递归的方式实现
     * 思路：1.先找到最后一个节点
     *      2.进行链表关系的反转
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        //递归终止条件
        if(head == null || head.next == null){
            return head;
        }
        //找到最后一个节点
        ListNode newNode = reverseList(head.next);
        //反转链路关系
        head.next.next = head;
        head.next = null;

        //返回的永远是最后的那个节点
        return newNode;
    }

    /**
     * 通过迭代方式实现
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head){

        return null;
    }
}
