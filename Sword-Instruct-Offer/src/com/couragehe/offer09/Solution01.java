package com.couragehe.offer09;


import java.util.Stack;

/**
 * @PackageName: com.couragehe.offer09
 * @ClassName: Solution01
 * @Description: 剑指 Offer 09. 用两个栈实现队列 https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * @Autor: CourageHe
 * @Date: 2021/2/10 23:58
 */

public class Solution01{
    class CQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer>stack2 = new Stack<>();
        public CQueue() {

        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if(stack2.isEmpty()&&!stack1.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            }else if(!stack2.isEmpty()){
                return stack2.pop();
            }
            return -1;
        }
    }
}
