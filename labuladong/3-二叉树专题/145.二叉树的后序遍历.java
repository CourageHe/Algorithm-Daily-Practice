/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        //非递归方式-前序遍历
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2= new Stack<>();
        stack.push(root);
        TreeNode cur = null;
        while(!stack.isEmpty()){
            cur = stack.pop();
            if(cur == null) continue;
            stack2.push(cur);
            stack.push(cur.left); 
            stack.push(cur.right); 
        }
        while(!stack2.isEmpty()){
            cur = stack2.pop();
            ans.add(cur.val);
        }
        return ans;
    }
}
// @lc code=end

