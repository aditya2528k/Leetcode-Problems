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
    public int maxDepth(TreeNode root) {
        return fun(root);
    }
    public int fun(TreeNode t){
        if(t == null){
            return 0;
        }
        int left = fun(t.left);
        int right = fun(t.right);

        return 1 + Math.max(left, right);
    }
}