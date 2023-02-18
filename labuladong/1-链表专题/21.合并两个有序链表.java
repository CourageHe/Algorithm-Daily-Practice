/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //虚拟头节点
        ListNode dummy = new ListNode(-1);
        ListNode pointer = dummy;
        while(list1!= null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next =list1;
                list1 = list1.next;
            }else{
                pointer.next =list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        if(list1!=null)
            pointer.next =list1;
        if(list2!=null)
            pointer.next =list2;
        return dummy.next;
    }
}
// @lc code=end

