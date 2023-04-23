/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    ListNode first = null ,former = null,latter = null;//反转的首节点，反转的前驱节点，反转的后驱节点
    public ListNode reverseBetween(ListNode head, int left, int right) {
        reverseBetweenhelper(head,left,right,1);
        if(former!=null){
            former.next = first;
            return head;
        } else  {
            return first;
        }
    }
    public ListNode reverseBetweenhelper(ListNode head, int left, int right,int index) {
        if(head == null) return head;
        if(index+1 == left) former = head;
        if(index == right) {
            first = head;
            latter = head.next;
            return head;
        }
        ListNode last = reverseBetweenhelper(head.next,left,right,index+1);
        if(index<right && index >= left){
            head.next.next =head;
            head.next = latter;
        }
        return last;
    }
      
}
// @lc code=end

