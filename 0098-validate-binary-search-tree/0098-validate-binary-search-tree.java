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
    public boolean isValidBST(TreeNode root) {
        fun(root);
        return ans;
    }
    TreeNode prev = null;
    boolean ans = true;
    public void fun(TreeNode t){
        if(t == null){
            return;
        }
        fun(t.left);
        if(prev == null){
            prev = t;
        }
        else if(t.val <= prev.val){
            ans = false;
        }
        prev = t;
        
        fun(t.right);

    }
}