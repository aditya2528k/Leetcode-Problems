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
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        fun(root, val);
        return ans;
    }
    public void fun(TreeNode t, int k){
        if(t == null){
            return;
        }
        if(t.val == k){
            ans = t;
            return;
        }
        if(t.val > k){
            fun(t.left, k);
        }else{
            fun(t.right, k);
        }
        return;
    }
}