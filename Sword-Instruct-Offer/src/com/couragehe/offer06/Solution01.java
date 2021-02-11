package com.couragehe.offer06;

import com.couragehe.common.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * @PackageName: com.couragehe.offer06
 * @ClassName: Solution01
 * @Description: 剑指 Offer 06. 从尾到头打印链表 https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/11 0:13
 */

public class Solution01 {

    public int[] reversePrint(ListNode head) {
        //使用栈完成反转
        Stack<Integer> stack = new Stack<>();
        ListNode pNode = head;
        while (pNode != null) {
            stack.push(pNode.val);
            pNode = pNode.next;
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = stack.pop();
        return ans;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = new int[]{1, 3, 2};
        ListNode head = new ListNode(arr);
        int[] ans = (new Solution01()).reversePrint(head);

        long endTime = System.currentTimeMillis();
        System.out.println("solution run completely");
        System.out.println("Time cost:" + (endTime - startTime) + "ms");
    }
}
