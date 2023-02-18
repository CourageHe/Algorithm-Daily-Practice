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
    //链表分成两个小链表，一个链表中的元素大小都小于 x，
    //另一个链表中的元素都大于等于 x，
    //最后再把这两条链表接到一起
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode dummy1  = new ListNode(-1);//小于
        ListNode dummy2  = new ListNode(-1);//大于或等于
        ListNode p = head;
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;

        while(p != null){
            if(p.val >= x){
                p2.next = p;
                p2 = p2.next;
            }else{
                p1.next = p;
                p1 = p1.next;
            }
            ListNode temp = p;
            p = p.next;
            temp.next = null;
        }
        p1.next = dummy2.next;
        return dummy1.next;
    }
}
// @lc code=end

