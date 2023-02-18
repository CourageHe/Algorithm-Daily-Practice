/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //先计算两条链表的长度，然后让 p1 和 p2 距离链表尾部的距离相同，然后齐头并进
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA,curB = headB;
        while(curA != null && curB != null){
            curA = curA.next;
            curB = curB.next;
        }
        ListNode pA = headA,pB = headB;
        if(curA != null){
            while(curA != null ){
                curA = curA.next;
                pA = pA.next;
            }
        }else{
            while(curB != null ){
                curB = curB.next;
                pB = pB.next;
            }
        }
        while(pA != pB){
            pA = pA.next;
            pB = pB.next;
        }
        return pA == pB ? pA : null;
    }
}
// @lc code=end

