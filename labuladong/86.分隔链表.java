/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 */

// @lc code=start
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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode dummy  = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = null;
        //定位比x大的首个节点,p1指向该节点的上个节点，用于插入
        //p2指向该节点，用于扫描小于x的节点
        while(p1.next != null){
            if(p1.next.val >= x){
                p2 = p1.next;
                break;
            }
            p1 = p1.next;
        }
        //扫描小于x的节点，进行插入操作
        while( p2 != null && p2.next != null){
            if(p2.next.val < x){
                ListNode temp = p2.next;
                p2.next = temp.next;
                temp.next = p1.next;
                p1.next = temp;
                p1 = p1.next;
            } else{
                p2 = p2.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end

