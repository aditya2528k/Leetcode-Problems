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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root, targetSum);
    }
    public boolean fun(TreeNode t, int sum){
        if(t == null){
            return false;
        }

        sum -= t.val;

        if(t.left == null && t.right == null){
            return sum == 0;
        }
        
        return fun(t.left, sum) || fun(t.right, sum);
    }
}