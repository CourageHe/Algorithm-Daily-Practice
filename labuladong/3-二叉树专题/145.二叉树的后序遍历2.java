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
    //使用单栈
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        //非递归方式-前序遍历
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root,prev = null;//prev 已遍历的最后一个结点
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                //遍历直至左尾
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if(cur.right == null ||cur.right == prev){
                //无右子节点，或该右子节点已遍历
                ans.add(cur.val);
                prev = cur;
                cur = null;
            }else{
                stack.push(cur);
                cur = cur.right;
            }
        }
        return ans;
    }
}
// @lc code=end

